package me.alberto.football.di.modules

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import me.alberto.football.di.viewmodel.ViewModelFactory
import me.alberto.football.di.viewmodel.ViewModelKey
import me.alberto.football.screens.competition.viewmodel.CompetitionViewModel
import me.alberto.football.screens.team.viewmodel.TeamViewModel
import me.alberto.football.screens.teams.viewmodel.TeamsViewModel

@Module
abstract class ViewModelModule {
    @Binds
    abstract fun bindsViewModelFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(CompetitionViewModel::class)
    abstract fun bindsCompetitionViewModel(competitionViewModel: CompetitionViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(TeamsViewModel::class)
    abstract fun bindsTeamsViewModel(teamsViewModel: TeamsViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(TeamViewModel::class)
    abstract fun bindsTeamViewModel(teamViewModel: TeamViewModel): ViewModel
}