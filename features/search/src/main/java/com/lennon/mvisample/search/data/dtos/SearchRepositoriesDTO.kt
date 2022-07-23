package com.lennon.mvisample.search.data.dtos

import com.google.gson.annotations.SerializedName


data class SearchRepositoriesDTO(
    @SerializedName("total_count") val totalCount: Long,
    @SerializedName("incomplete_results") val incompleteResults: Boolean,
    @SerializedName("items") val items: List<RepositoryDTO>,
)
