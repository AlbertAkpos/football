package me.alberto.football.data.domain.model

data class Team(
    val id: Long,
    val name: String,
    val crestUrl: String?,
    val clubColors: List<Int>
)
