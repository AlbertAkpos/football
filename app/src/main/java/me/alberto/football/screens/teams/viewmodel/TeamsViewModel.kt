package me.alberto.football.screens.teams.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import me.alberto.football.data.domain.model.Team
import me.alberto.football.data.domain.repository.IRepository
import me.alberto.football.data.mapper.toDomain
import me.alberto.football.screens.base.BaseViewModel
import me.alberto.football.util.State
import me.alberto.football.util.helper.ColorHelper
import me.alberto.football.util.helper.NetworkHelper
import retrofit2.HttpException
import javax.inject.Inject

class TeamsViewModel @Inject constructor(
    private val repository: IRepository,
    networkHelper: NetworkHelper,
    private val colorHelper: ColorHelper
) : BaseViewModel(networkHelper) {

    private val _state = MutableLiveData<State>()
    val state: LiveData<State> = _state

    private val _teams = MutableLiveData<List<Team>>()
    val teams: LiveData<List<Team>> = _teams


    /**
     * Get teams for a given competition
     * @param compId Id of the competition
     */
    fun getTeams(compId: Long) {
        if (!isConnected) {
            _state.postValue(State.Error("You're offline"))
            return
        }
        viewModelScope.launch {
            try {
                _state.postValue(State.Loading)

                val response = repository.getTeams(compId)
                _teams.postValue(response.teams.map { it.toDomain(colorHelper) })

                _state.postValue(State.Done)
            } catch (exp: Exception) {
                if(exp is HttpException) {
                    _state.postValue(State.Error("Server error. Or you might have exceeded 10 calls per minute."))
                } else{
                    _state.postValue(State.Error(exp.message ?: "Some error occurred"))
                }
            }
        }
    }


}