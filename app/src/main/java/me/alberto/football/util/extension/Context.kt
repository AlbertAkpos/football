package me.alberto.football.util.extension

import android.content.Context
import me.alberto.football.R
import me.alberto.football.util.COLOR_RES
import java.util.*

fun Context.getColor(colorName: String): Int {
    val colorId =
        resources.getIdentifier(colorName.toLowerCase(Locale.ROOT), COLOR_RES, packageName)
    return if (colorId == 0) {
        //Default color
        R.color.black
    } else {
        colorId
    }
}