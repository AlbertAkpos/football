package me.alberto.football.di.modules

import dagger.Binds
import dagger.Module
import me.alberto.football.data.domain.repository.IRepository
import me.alberto.football.data.domain.repository.Repository
import me.alberto.football.data.local.source.ILocalSource
import me.alberto.football.data.local.source.LocalSource
import me.alberto.football.data.remote.source.IRemoteSource
import me.alberto.football.data.remote.source.RemoteSource

@Module
abstract class DataModule {
    @Binds
    abstract fun provideRepository(repository: Repository): IRepository

    @Binds
    abstract fun provideRemoteSource(remoteSource: RemoteSource): IRemoteSource

    @Binds
    abstract fun provideLocalSource(localSource: LocalSource): ILocalSource

}