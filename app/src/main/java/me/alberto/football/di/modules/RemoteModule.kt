package me.alberto.football.di.modules

import dagger.Module
import dagger.Provides
import me.alberto.football.data.remote.restclient.RemoteClient

@Module
class RemoteModule {
    @Provides
    fun provideRestClient(): RemoteClient {
        return RemoteClient()
    }
}