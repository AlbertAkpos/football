package me.alberto.football.data.domain.model

data class Player(
    val id: Long,
    val name: String,
    val position: String?,
    val dateOfBirth: String,
    val nationality: String,
)
