package me.alberto.football.data.remote.model

import com.google.gson.annotations.SerializedName

data class CompetitionDTO(
    @SerializedName("id")
    val id: Long,
    @SerializedName("area")
    val area: AreaDTO,
    @SerializedName("name")
    val name: String,
    @SerializedName("code")
    val code: Any?,
    @SerializedName("emblemUrl")
    val emblemUrl: Any?,
    @SerializedName("plan")
    val plan: String,
    @SerializedName("currentSeason")
    val currentSeason: CurrentSeasonDTO,
    @SerializedName("numberOfAvailableSeasons")
    val numberOfAvailableSeasons: Long,
    @SerializedName("lastUpdated")
    val lastUpdated: String
)
