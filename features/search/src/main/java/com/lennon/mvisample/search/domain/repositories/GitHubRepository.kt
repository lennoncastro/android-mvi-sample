package com.lennon.mvisample.search.domain.repositories

import com.lennon.mvisample.search.domain.entities.SearchRepositoriesEntity


interface GitHubRepository {
    suspend fun searchRepositories(
        language: String,
        sort: String,
        page: Long
    ): SearchRepositoriesEntity
}