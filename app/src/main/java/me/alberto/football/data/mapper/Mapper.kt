package me.alberto.football.data.mapper

import me.alberto.football.data.domain.model.Competition
import me.alberto.football.data.local.model.CompetitionEntity
import me.alberto.football.data.remote.model.CompetitionDTO
import me.alberto.football.util.getRandomColor

fun CompetitionDTO.toEntity(): CompetitionEntity {
    return CompetitionEntity(
        id = id,
        startDate = currentSeason?.startDate,
        endDate = currentSeason?.endDate,
        name = name,
        country = area.name,
        color = getRandomColor()
    )
}


fun CompetitionEntity.toDomain(): Competition {
    return Competition(id, name, country, startDate, endDate, color)
}