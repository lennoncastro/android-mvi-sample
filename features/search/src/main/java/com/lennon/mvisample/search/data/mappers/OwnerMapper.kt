package com.lennon.mvisample.search.data.mappers

import com.lennon.mvisample.search.data.dtos.OwnerDTO
import com.lennon.mvisample.search.domain.entities.OwnerEntity


fun OwnerDTO.mapToEntity() = OwnerEntity(
    this.id,
    this.login,
    this.avatarUrl,
    this.owner,
)
