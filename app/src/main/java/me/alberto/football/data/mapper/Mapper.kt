package me.alberto.football.data.mapper

import android.util.Log
import me.alberto.football.data.domain.model.Club
import me.alberto.football.data.domain.model.Competition
import me.alberto.football.data.domain.model.Player
import me.alberto.football.data.domain.model.Team
import me.alberto.football.data.local.model.CompetitionEntity
import me.alberto.football.data.remote.model.CompetitionDTO
import me.alberto.football.data.remote.model.TeamDTO
import me.alberto.football.data.remote.response.TeamResponse
import me.alberto.football.util.getRandomColor
import me.alberto.football.util.helper.ColorHelper
import java.text.SimpleDateFormat
import java.util.*

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
    val colors =
        clubColors?.split("/")?.map { colorHelper.getColor(it.trim().toLowerCase()) } ?: emptyList()
    return Team(id, name, crestURL, colors)
}

fun TeamResponse.toClub(colorHelper: ColorHelper): Club {
    val players = squad.map {
        Player(
            it.id,
            it.name,
            it.position,
            formatDate(it.dateOfBirth ?: ""),
            it.nationality ?: ""
        )
    }
    val clubColors = clubColors.split("/").map { colorHelper.getColor(it.trim()) }
    Log.d("ji-color", "int colors: $clubColors")
    return Club(
        id = id,
        name = name,
        shortName = shortName,
        crestURL = crestURL,
        address = address,
        phone = phone ?: "",
        website = website ?: "",
        email = email ?: "",
        founded = founded.toString(),
        squad = players,
        clubColors = clubColors
    )
}

fun formatDate(rawDate: String): String {
    return try {
        val inputFormatter = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX", Locale.ENGLISH)
        val outputFormatter = SimpleDateFormat("dd-MM-yyy", Locale.ENGLISH)
        val date = inputFormatter.parse(rawDate)
        outputFormatter.format(date)
    } catch (exp: Exception) {
        exp.printStackTrace()
        ""
    }

}