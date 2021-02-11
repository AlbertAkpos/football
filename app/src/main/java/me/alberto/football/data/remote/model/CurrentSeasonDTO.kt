package me.alberto.football.data.remote.model

import com.google.gson.annotations.SerializedName

data class CurrentSeasonDTO(
    @SerializedName("id")
    val id: Long,
    @SerializedName("startDate")
    val startDate: String?,
    @SerializedName("endDate")
    val endDate: String?,
    @SerializedName("currentMatchday")
    val currentMatchday: Any?,
    @SerializedName("winner")
    val winner: Any?
)
