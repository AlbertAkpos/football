package me.alberto.football.data.domain.repository

import androidx.lifecycle.LiveData
import me.alberto.football.data.local.model.CompetitionEntity
import me.alberto.football.data.remote.response.TeamResponse
import me.alberto.football.data.remote.response.TeamsResponse

interface IRepository {
    suspend fun getRemoteCompetition()
    fun getCompetition(): LiveData<List<CompetitionEntity>>
    suspend fun getTeams(compId: Long): TeamsResponse
    suspend fun getTeam(teamId: Long): TeamResponse
}