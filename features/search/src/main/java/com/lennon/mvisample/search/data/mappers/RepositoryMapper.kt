package com.lennon.mvisample.search.data.mappers

import com.lennon.mvisample.search.data.dtos.RepositoryDTO
import com.lennon.mvisample.search.domain.entities.RepositoryEntity


fun RepositoryDTO.mapToEntity() = RepositoryEntity(
    this.id,
    this.name,
    this.fullName,
    this.owner.mapToEntity(),
)
