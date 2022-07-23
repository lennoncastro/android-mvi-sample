package com.lennon.mvisample.search

import com.lennon.mvisample.search.data.GitHubService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import mvisample.network.di.httpClient.HttpClient


@Module
@InstallIn(ActivityComponent::class)
object SearchModule {

    @Provides
    fun providesGitHubService(httpClient: HttpClient): GitHubService {
        return httpClient.createService(GitHubService::class.java)
    }
}