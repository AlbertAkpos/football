package me.alberto.football.data.remote.model

import com.google.gson.annotations.SerializedName

data class AreaDTO(
    @SerializedName("id")
    val id: Long,
    @SerializedName("name")
    val name: String,
    @SerializedName("countryCode")
    val countryCode: String?,
    @SerializedName("ensignUrl")
    val ensignURL: Any?
)
