package com.lennon.mvisample.search.domain.entities


data class SearchRepositoriesEntity(
    val totalCount: Long,
    val incompleteResults: Boolean,
    val items: List<RepositoryEntity> = emptyList(),
)
