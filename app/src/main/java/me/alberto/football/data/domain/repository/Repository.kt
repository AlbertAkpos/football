package me.alberto.football.data.domain.repository

import androidx.lifecycle.LiveData
import me.alberto.football.R
import me.alberto.football.data.domain.model.Competition
import me.alberto.football.data.local.model.CompetitionEntity
import me.alberto.football.data.local.source.ILocalSource
import me.alberto.football.data.remote.source.IRemoteSource
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
}