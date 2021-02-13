package me.alberto.football.util.extension

fun String.removeSpaces(): String {
    return replace("\\s".toRegex(), "")
}