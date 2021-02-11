package me.alberto.football.screens.splash.view

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import me.alberto.football.R
import me.alberto.football.screens.competition.view.CompetitionsActivity
import java.util.*
import kotlin.concurrent.schedule

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        actionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spash)
        Timer().schedule(3000) {
            startActivity(Intent(this@SplashActivity, CompetitionsActivity::class.java))
            finish()
        }
    }
}