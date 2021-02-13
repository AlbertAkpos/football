package me.alberto.football.data.remote.model

import com.google.gson.annotations.SerializedName

data class PlayerDTO(
    @SerializedName("id")
    val id: Long,
    @SerializedName("name")
    val name: String,
    @SerializedName("position")
    val position: String?,
    @SerializedName("dateOfBirth")
    val dateOfBirth: String?,
    @SerializedName("countryOfBirth")
    val countryOfBirth: String,
    @SerializedName("nationality")
    val nationality: String?,
    @SerializedName("shirtNumber")
    val shirtNumber: Any?,
    @SerializedName("role")
    val role: String?
)
