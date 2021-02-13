package me.alberto.football.data.remote.response

import com.google.gson.annotations.SerializedName
import me.alberto.football.data.remote.model.CompetitionDTO
import me.alberto.football.data.remote.model.Filter
import me.alberto.football.data.remote.model.SeasonDTO
import me.alberto.football.data.remote.model.TeamDTO

data class TeamsResponse(
    @SerializedName("count")
    val count: Long,
    @SerializedName("filters")
    val filters: Filter,
    @SerializedName("competition")
    val competition: CompetitionDTO?,
    @SerializedName("season")
    val season: SeasonDTO,
    @SerializedName("teams")
    val teams: List<TeamDTO>
)
