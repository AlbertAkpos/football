package me.alberto.football.data.remote.model

import com.google.gson.annotations.SerializedName

data class ActiveCompetitionDTO(
    @SerializedName("id")
    val id: Long,
    @SerializedName("area")
    val area: AreaDTO,
    @SerializedName("name")
    val name: String,
    @SerializedName("code")
    val code: String,
    @SerializedName("plan")
    val plan: String,
    @SerializedName("lastUpdated")
    val lastUpdated: String
)
