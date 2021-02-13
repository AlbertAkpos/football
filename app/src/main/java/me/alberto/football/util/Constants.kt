package me.alberto.football.util

import android.graphics.Color
import java.util.*

object Urls {
    const val BASE_URL = "https://api.football-data.org/"
    const val COMPETITIONS = "v2/competitions"
    const val COMPETITION_TEAMS = "v2/competitions/{id}/teams"
    const val TEAM = "v2/teams/{id}"
}
const val COLOR_RES = "color"
const val COMPETITION_KEY = "comp_key"
const val COMPETITION_TABLE = "competition_table"
const val DEFAULT_COMP_ID = 0L
const val TEAM_KEY = "team_key"
fun getRandomColor(): Int {
    val random = Random()
    return Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256))
}