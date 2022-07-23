package com.lennon.mvisample.search.data.mappers

import com.lennon.mvisample.search.data.dtos.OwnerDTO
import com.lennon.mvisample.search.domain.entities.OwnerEntity


fun OwnerDTO.mapToEntity() = OwnerEntity(
    id = this.id ?: 0,
    login = this.login ?: "",
    avatarUrl = this.avatarUrl ?: "",
    owner = this.owner ?: "",
)
