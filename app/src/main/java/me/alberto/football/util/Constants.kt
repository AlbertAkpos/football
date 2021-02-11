package me.alberto.football.util

import android.graphics.Color
import java.util.*

object Urls {
    const val BASE_URL = "https://api.football-data.org/"
    const val COMPETITIONS = "v2/competitions"
    const val COMPETITION_TEAMS = "/teams"
    const val TEAM = "v2/teams"
}
const val COLOR_RES = "color"

const val COMPETITION_TABLE = "competition_table"
fun getRandomColor(): Int {
    val random = Random()
    return Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256))
}