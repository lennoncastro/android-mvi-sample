package com.lennon.mvisample.search.data.dtos

import com.google.gson.annotations.SerializedName


data class OwnerDTO(
    @SerializedName("id") val id: Long,
    @SerializedName("login") val login: String,
    @SerializedName("avatar_url") val avatarUrl: String,
    @SerializedName("owner") val owner: String,
)
