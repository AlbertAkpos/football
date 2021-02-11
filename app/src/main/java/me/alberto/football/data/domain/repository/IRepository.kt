package me.alberto.football.data.domain.repository

import androidx.lifecycle.LiveData
import me.alberto.football.data.local.model.CompetitionEntity

interface IRepository {
    suspend fun getRemoteCompetition()
    fun getCompetition(): LiveData<List<CompetitionEntity>>
}