package me.alberto.football.data.remote.source

import me.alberto.football.data.remote.response.CompetitionsResponse

interface IRemoteSource {
    suspend fun getCompetitions(): CompetitionsResponse
}