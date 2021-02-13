package me.alberto.football.screens.team.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import me.alberto.football.data.domain.model.Club
import me.alberto.football.data.domain.repository.IRepository
import me.alberto.football.data.mapper.toClub
import me.alberto.football.screens.base.BaseViewModel
import me.alberto.football.util.State
import me.alberto.football.util.helper.ColorHelper
import me.alberto.football.util.helper.NetworkHelper
import retrofit2.HttpException
import javax.inject.Inject

class TeamViewModel @Inject constructor(
    networkHelper: NetworkHelper,
    private val repository: IRepository,
    private val colorHelper: ColorHelper
) : BaseViewModel(networkHelper) {

    private val _state = MutableLiveData<State>()
    val state: LiveData<State> = _state

    private val _club = MutableLiveData<Club>()
    val club: LiveData<Club> = _club

    fun getTeam(teamId: Long) {
        if (!isConnected()) {
            _state.postValue(State.Error("Offline. Please try again"))
            return
        }

        viewModelScope.launch {
            try {
                _state.postValue(State.Loading)
                val response = repository.getTeam(teamId)
                _club.postValue(response.toClub(colorHelper))
                _state.postValue(State.Done)
            } catch (exp: Exception) {
                exp.printStackTrace()
                if (exp is HttpException) {
                    _state.postValue(State.Error("Server error or this endpoint is not in your free plan."))
                } else {
                    _state.postValue(State.Error(exp.message ?: "Some error occurred"))
                }
            }
        }
    }


}