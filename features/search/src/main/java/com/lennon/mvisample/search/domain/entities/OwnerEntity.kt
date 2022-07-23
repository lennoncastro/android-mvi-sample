package com.lennon.mvisample.search.domain.entities


data class OwnerEntity(
    val id: Long,
    val login: String,
    val avatarUrl: String,
    val owner: String,
)
