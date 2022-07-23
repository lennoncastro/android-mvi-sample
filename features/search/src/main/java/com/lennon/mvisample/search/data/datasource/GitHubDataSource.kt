package com.lennon.mvisample.search.data.datasource

import com.lennon.mvisample.search.data.dtos.SearchRepositoriesDTO


interface GitHubDataSource {
    suspend fun searchRepositories(
        language: String,
        sort: String,
        page: Long
    ): SearchRepositoriesDTO
}
