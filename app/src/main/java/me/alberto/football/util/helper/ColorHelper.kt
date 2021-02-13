package me.alberto.football.util.helper

import android.content.Context
import android.util.Log
import me.alberto.football.util.extension.getColor
import javax.inject.Inject

/**
 * A helper class to get color from a string
 * eg color string = "red" returns the R.color.id
 */
class ColorHelper @Inject constructor(private val context: Context) {
    fun getColor(colorName: String): Int {
        return context.getColor(colorName)
    }
}