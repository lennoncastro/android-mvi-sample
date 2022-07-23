package com.lennon.mvisample.search.data.mappers

import com.lennon.mvisample.search.data.dtos.SearchRepositoriesDTO
import com.lennon.mvisample.search.domain.entities.SearchRepositoriesEntity


fun SearchRepositoriesDTO.mapToEntity() = SearchRepositoriesEntity(
    totalCount = this.totalCount ?: 0,
    incompleteResults = this.incompleteResults ?: false,
    items = this.items
        ?.filter { repositoryDTO -> repositoryDTO.owner != null }
        ?.map { repositoryDTO -> repositoryDTO.mapToEntity() } ?: emptyList()
)
