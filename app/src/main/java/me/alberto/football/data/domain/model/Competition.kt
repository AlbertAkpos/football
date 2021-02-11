package me.alberto.football.data.domain.model

data class Competition(
    val id: Long,
    val name: String,
    val country: String,
    val startDate: String,
    val endDate: String,
    val color: Int
)
