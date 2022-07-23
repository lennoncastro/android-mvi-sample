package com.lennon.mvisample.search.data

import com.lennon.mvisample.search.data.dtos.SearchRepositoriesDTO
import retrofit2.http.GET
import retrofit2.http.Query


interface GitHubService {

    @GET("search/repositories")
    suspend fun searchRepositories(
        @Query("q") language: String,
        @Query("sort") sort: String,
        @Query("page") page: Long
    ): SearchRepositoriesDTO
}
