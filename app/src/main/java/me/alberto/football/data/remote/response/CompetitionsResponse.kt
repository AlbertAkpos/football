package me.alberto.football.data.remote.response

import com.google.gson.annotations.SerializedName
import me.alberto.football.data.remote.model.CompetitionDTO
import me.alberto.football.data.remote.model.Filter

data class CompetitionsResponse(
    @SerializedName("count")
    val count: Long,
    @SerializedName("filters")
    val filters: Filter,
    @SerializedName("competitions")
    val competitions: List<CompetitionDTO>
)
