package me.alberto.football.data.local.source

import androidx.lifecycle.LiveData
import me.alberto.football.data.local.database.CompetitionDatabase
import me.alberto.football.data.local.model.CompetitionEntity
import me.alberto.football.data.mapper.toEntity
import me.alberto.football.data.remote.model.CompetitionDTO
import javax.inject.Inject

class LocalSource @Inject constructor(private val database: CompetitionDatabase): ILocalSource {
    override suspend fun addAllCompetition(competitions: List<CompetitionDTO>) {
        val entities = competitions.map { it.toEntity() }.toTypedArray()
        database.compDao.addCompetition(*entities)
    }

    override fun getCompetitions(): LiveData<List<CompetitionEntity>> {
        return database.compDao.getCompetition()
    }
}