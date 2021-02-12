package me.alberto.football.screens.base

import androidx.lifecycle.ViewModel
import me.alberto.football.util.helper.NetworkHelper

abstract class BaseViewModel(networkHelper: NetworkHelper) : ViewModel() {
    protected val isConnected = networkHelper.isConnected()
}