package me.alberto.football.mockdata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import me.alberto.football.data.local.model.CompetitionEntity
import me.alberto.football.data.local.source.ILocalSource
import me.alberto.football.data.remote.model.CompetitionDTO

class FakeLocalSource : ILocalSource {
    override suspend fun addAllCompetition(competitions: List<CompetitionDTO>) {
        val result =
            competitions.map {
                CompetitionEntity(
                    id = it.id,
                    name = it.name,
                    country = it.area.name,
                    color = 0,
                    endDate = it.currentSeason?.endDate,
                    startDate = it.currentSeason?.startDate
                )
            }
        database.addAll(result)
    }

    override fun getCompetitions(): LiveData<List<CompetitionEntity>> {
        return MutableLiveData(database)
    }
}