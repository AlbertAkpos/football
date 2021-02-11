package me.alberto.football.di.modules

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import me.alberto.football.di.viewmodel.ViewModelFactory
import me.alberto.football.di.viewmodel.ViewModelKey
import me.alberto.football.screens.competition.viewmodel.CompetitionViewModel
@Module
abstract class ViewModelModule {
    @Binds
    abstract fun bindsViewModelFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(CompetitionViewModel::class)
    abstract fun bindsCompetitionViewModel(competitionViewModel: CompetitionViewModel): ViewModel
}