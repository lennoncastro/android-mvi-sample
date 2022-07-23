package com.lennon.mvisample.search.domain.entities


data class RepositoryEntity(
    val id: Long,
    val name: String,
    val fullName: String,
    val owner: OwnerEntity,
)