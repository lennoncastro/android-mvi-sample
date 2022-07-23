package com.lennon.mvisample.search

import com.lennon.mvisample.search.data.GitHubService
import com.lennon.mvisample.search.data.datasource.GitHubDataSource
import com.lennon.mvisample.search.data.datasource.GitHubRemoteDataSource
import com.lennon.mvisample.search.data.repositories.GitHubRepositoryImpl
import com.lennon.mvisample.search.domain.repositories.GitHubRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import mvisample.network.di.httpClient.HttpClientImpl


@Module
@InstallIn(SingletonComponent::class)
object SearchModuleService {

    @Provides
    fun providesGitHubService(httpClient: HttpClientImpl): GitHubService {
        return httpClient.createService(GitHubService::class.java)
    }

    @Provides
    fun providesGitHubRemoteDataSource(
        service: GitHubService
    ): GitHubDataSource = GitHubRemoteDataSource(service)

    @Provides
    fun providesGitHubRepository(
        dataSource: GitHubDataSource
    ): GitHubRepository = GitHubRepositoryImpl(dataSource)
}
