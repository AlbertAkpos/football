package me.alberto.football.di.modules

import android.content.Context
import dagger.Module
import dagger.Provides
import me.alberto.football.data.local.database.CompetitionDatabase
import javax.inject.Singleton

@Module
class LocalModule {

    @Provides
    @Singleton
    fun provideDatabase(context: Context): CompetitionDatabase {
        return CompetitionDatabase.getDatabase(context)
    }
}