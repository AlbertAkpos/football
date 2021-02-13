package me.alberto.football.util.extension

import android.content.Context
import android.content.res.Resources
import android.util.Log
import me.alberto.football.R
import me.alberto.football.util.COLOR_RES

fun Context.getColor(colorName: String): Int {
    val res: Resources = resources
    val packageName: String = packageName
    val colorId: Int = res.getIdentifier(colorName.toLowerCase().removeSpaces(), COLOR_RES, packageName)
    return if (colorId == 0) {
        R.color.black
    } else {
        res.getColor(colorId)
    }
}