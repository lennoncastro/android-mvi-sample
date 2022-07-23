package com.lennon.mvisample.search.data.repositories

import com.lennon.mvisample.search.data.datasource.GitHubDataSource
import com.lennon.mvisample.search.data.mappers.mapToEntity
import com.lennon.mvisample.search.domain.entities.SearchRepositoriesEntity
import com.lennon.mvisample.search.domain.repositories.GitHubRepository
import javax.inject.Inject


class GitHubRepositoryImpl @Inject constructor(
    private val dataSource: GitHubDataSource
) : GitHubRepository {
    override suspend fun searchRepositories(
        language: String,
        sort: String,
        page: Long
    ): SearchRepositoriesEntity {
        return dataSource.searchRepositories(
            language = language,
            sort = sort,
            page = page
        ).mapToEntity()
    }
}