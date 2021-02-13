package me.alberto.football.data.domain.repository

import android.util.Log
import androidx.lifecycle.LiveData
import me.alberto.football.data.local.model.CompetitionEntity
import me.alberto.football.data.local.source.ILocalSource
import me.alberto.football.data.remote.response.TeamResponse
import me.alberto.football.data.remote.response.TeamsResponse
import me.alberto.football.data.remote.source.IRemoteSource
import java.time.LocalDate
import javax.inject.Inject

class Repository @Inject constructor(
    private val remoteSource: IRemoteSource,
    private val localSource: ILocalSource
) : IRepository {
    override suspend fun getRemoteCompetition() {
        val response = remoteSource.getCompetitions()
        localSource.addAllCompetition(response.competitions)
    }

    override fun getCompetition(): LiveData<List<CompetitionEntity>> {
        return localSource.getCompetitions()
    }

    override suspend fun getTeams(compId: Long): TeamsResponse {
        return remoteSource.getTeams(compId)
    }

    override suspend fun getTeam(teamId: Long): TeamResponse {
        return remoteSource.getTeam(teamId)
    }
}