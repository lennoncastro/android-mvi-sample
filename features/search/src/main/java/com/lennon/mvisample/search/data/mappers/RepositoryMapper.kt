package com.lennon.mvisample.search.data.mappers

import com.lennon.mvisample.search.data.dtos.RepositoryDTO
import com.lennon.mvisample.search.domain.entities.RepositoryEntity


fun RepositoryDTO.mapToEntity() = RepositoryEntity(
    id = this.id ?: 0,
    name = this.name ?: "",
    fullName = this.fullName ?: "",
    owner = this.owner?.mapToEntity() ?: throw Exception("repository should have a owner"),
)
