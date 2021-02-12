package me.alberto.football.data.remote.source

import me.alberto.football.data.remote.response.CompetitionsResponse
import me.alberto.football.data.remote.response.TeamResponse

interface IRemoteSource {
    suspend fun getCompetitions(): CompetitionsResponse
    suspend fun getTeams(compId: Long): TeamResponse
}