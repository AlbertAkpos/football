package me.alberto.football.screens.base

import androidx.lifecycle.ViewModel
import me.alberto.football.util.helper.NetworkHelper

abstract class BaseViewModel(private val networkHelper: NetworkHelper) : ViewModel() {
    protected fun isConnected(): Boolean =  networkHelper.isConnected()
}