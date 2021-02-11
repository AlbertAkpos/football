package me.alberto.football

import android.app.Application
import me.alberto.football.di.component.AppComponent
import me.alberto.football.di.component.DaggerAppComponent

class App : Application() {
    lateinit var appComponent: AppComponent
    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.factory().create(this)
    }
}