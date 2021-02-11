package me.alberto.football.data.local.source

import androidx.lifecycle.LiveData
import me.alberto.football.data.local.model.CompetitionEntity
import me.alberto.football.data.remote.model.CompetitionDTO

interface ILocalSource {
    suspend fun addAllCompetition(competitions: List<CompetitionDTO>)
    fun getCompetitions(): LiveData<List<CompetitionEntity>>
}