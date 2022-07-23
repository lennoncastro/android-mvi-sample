package com.lennon.mvisample.search.domain.usecases

import com.lennon.mvisample.search.domain.entities.SearchRepositoriesEntity
import com.lennon.mvisample.search.domain.repositories.GitHubRepository
import javax.inject.Inject


class SearchRepositoriesByLanguageUseCase @Inject constructor(private val repository: GitHubRepository) {
    suspend operator fun invoke(
        language: String,
        sort: String,
        page: Long
    ): SearchRepositoriesEntity = repository.searchRepositories(
        language = language,
        sort = sort,
        page = page
    )
}