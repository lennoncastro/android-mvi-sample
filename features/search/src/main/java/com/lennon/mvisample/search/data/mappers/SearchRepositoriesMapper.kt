package com.lennon.mvisample.search.data.mappers

import com.lennon.mvisample.search.data.dtos.SearchRepositoriesDTO
import com.lennon.mvisample.search.domain.entities.SearchRepositoriesEntity


fun SearchRepositoriesDTO.mapToEntity() = SearchRepositoriesEntity(
    this.totalCount,
    this.incompleteResults,
    this.items.map { repositoryDTO -> repositoryDTO.mapToEntity() }
)
