package me.alberto.football.util.helper

import android.content.Context
import me.alberto.football.util.extension.getColor
import javax.inject.Inject

class ColorHelper @Inject constructor(private val context: Context) {
    fun getColor(colorName: String): Int = context.getColor(colorName)
}