package me.alberto.football.di.component

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import me.alberto.football.di.modules.DataModule
import me.alberto.football.di.modules.LocalModule
import me.alberto.football.di.modules.RemoteModule
import javax.inject.Singleton

@Component(modules = [DataModule::class, LocalModule::class, RemoteModule::class])
@Singleton
interface AppComponent {
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }
}