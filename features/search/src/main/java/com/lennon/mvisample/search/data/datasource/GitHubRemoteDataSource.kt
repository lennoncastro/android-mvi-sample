package com.lennon.mvisample.search.data.datasource

import com.lennon.mvisample.search.data.GitHubService
import com.lennon.mvisample.search.data.dtos.SearchRepositoriesDTO
import javax.inject.Inject


class GitHubRemoteDataSource @Inject constructor(private val service: GitHubService) :
    GitHubDataSource {

    override suspend fun searchRepositories(
        language: String,
        sort: String,
        page: Long
    ): SearchRepositoriesDTO = service.searchRepositories(
        language = language,
        sort = sort,
        page = page
    )
}
