package me.alberto.football.util

sealed class State {
    object Loading : State()
    object Done : State()
    data class Error(val error: String) : State()
}
