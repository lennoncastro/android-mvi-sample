package com.lennon.mvisample.search.data.dtos

import com.google.gson.annotations.SerializedName


data class RepositoryDTO(
    @SerializedName("id") val id: Long?,
    @SerializedName("name") val name: String?,
    @SerializedName("full_name") val fullName: String?,
    @SerializedName("owner") val owner: OwnerDTO?,
)