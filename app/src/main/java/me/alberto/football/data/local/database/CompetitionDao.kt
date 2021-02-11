package me.alberto.football.data.local.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import me.alberto.football.data.local.model.CompetitionEntity

@Dao
interface CompetitionDao {
    @Query("SELECT * FROM competition_table")
    fun getCompetition(): LiveData<List<CompetitionEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addCompetition(vararg competitionEntity: CompetitionEntity)
}