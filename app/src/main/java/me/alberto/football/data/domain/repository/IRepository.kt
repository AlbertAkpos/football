package me.alberto.football.data.domain.repository

import androidx.lifecycle.LiveData
import me.alberto.football.data.local.model.CompetitionEntity
import me.alberto.football.data.remote.response.TeamResponse

interface IRepository {
    suspend fun getRemoteCompetition()
    fun getCompetition(): LiveData<List<CompetitionEntity>>
    suspend fun getTeams(compId: Long): TeamResponse
}