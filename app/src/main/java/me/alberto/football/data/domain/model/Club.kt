package me.alberto.football.data.domain.model

data class Club(
    val id: Long,
    val name: String,
    val shortName: String,
    val crestURL: String?,
    val address: String,
    val phone: String,
    val website: String,
    val email: String,
    val founded: String,
    val clubColors: List<Int>,
    val squad: List<Player>
)
