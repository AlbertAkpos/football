package me.alberto.football.screens.competition.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import me.alberto.football.data.domain.repository.Repository
import me.alberto.football.data.mapper.toDomain
import me.alberto.football.screens.base.BaseViewModel
import me.alberto.football.util.State
import me.alberto.football.util.helper.NetworkHelper
import javax.inject.Inject

class CompetitionViewModel @Inject constructor(
    private val repository: Repository,
    networkHelper: NetworkHelper
) : BaseViewModel(networkHelper) {

    private val _state = MutableLiveData<State>()
    val state: LiveData<State> = _state

    val competitions = Transformations.map(repository.getCompetition()) { list ->
        if (list.isEmpty()) getRemote()
        list.map { it.toDomain() }
    }


    fun getRemote() {
        if (!isConnected()) {
            _state.postValue(State.Error("You're offline"))
            return
        }

        viewModelScope.launch {
            try {
                _state.postValue(State.Loading)
                repository.getRemoteCompetition()
                _state.postValue(State.Done)
            } catch (exp: Exception) {
                exp.printStackTrace()
                _state.postValue(State.Error(exp.message ?: "Some error occurred"))
            }
        }
    }


}