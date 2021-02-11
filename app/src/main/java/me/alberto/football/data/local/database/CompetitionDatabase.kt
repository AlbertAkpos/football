package me.alberto.football.data.local.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import me.alberto.football.data.local.model.CompetitionEntity

@Database(entities = [CompetitionEntity::class], version = 1)
abstract class CompetitionDatabase : RoomDatabase() {
    abstract val compDao: CompetitionDao
    companion object {
        private lateinit var instance: CompetitionDatabase
        private val DATABASE = "comp_database"
        fun getDatabase(context: Context): CompetitionDatabase {
            if (!::instance.isInitialized) {
                instance =
                    Room.databaseBuilder(context, CompetitionDatabase::class.java, DATABASE).build()
            }
            return instance
        }
    }
}