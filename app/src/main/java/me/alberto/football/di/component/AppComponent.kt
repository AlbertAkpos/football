package me.alberto.football.di.component

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import me.alberto.football.di.modules.DataModule
import me.alberto.football.di.modules.LocalModule
import me.alberto.football.di.modules.RemoteModule
import me.alberto.football.di.modules.ViewModelModule
import me.alberto.football.screens.competition.view.CompetitionsActivity
import javax.inject.Singleton

@Component(modules = [DataModule::class, LocalModule::class, RemoteModule::class, ViewModelModule::class])
@Singleton
interface AppComponent {
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }

    fun inject(activity: CompetitionsActivity)
}