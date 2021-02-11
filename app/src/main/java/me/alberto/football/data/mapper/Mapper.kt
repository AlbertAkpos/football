package me.alberto.football.data.mapper

import me.alberto.football.data.domain.model.Competition
import me.alberto.football.data.domain.model.Team
import me.alberto.football.data.local.model.CompetitionEntity
import me.alberto.football.data.remote.model.CompetitionDTO
import me.alberto.football.data.remote.model.TeamDTO
import me.alberto.football.util.getRandomColor
import me.alberto.football.util.helper.ColorHelper

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

fun TeamDTO.toDomain(colorHelper: ColorHelper): Team {
    val colors = clubColors?.split("/")?.map { colorHelper.getColor(it.trim()) } ?: emptyList()
    return Team(id, name, crestURL, colors)
}