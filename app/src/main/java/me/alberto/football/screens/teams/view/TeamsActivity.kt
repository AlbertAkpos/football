package me.alberto.football.screens.teams.view

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.snackbar.Snackbar
import me.alberto.football.App
import me.alberto.football.R
import me.alberto.football.data.domain.model.Competition
import me.alberto.football.data.domain.model.Team
import me.alberto.football.databinding.ActivityTeamsBinding
import me.alberto.football.screens.team.view.TeamActivity
import me.alberto.football.screens.teams.adapter.TeamsAdapter
import me.alberto.football.screens.teams.viewmodel.TeamsViewModel
import me.alberto.football.util.COMPETITION_KEY
import me.alberto.football.util.State
import me.alberto.football.util.TEAM_KEY
import me.alberto.football.util.extension.beGone
import me.alberto.football.util.extension.beVisible
import me.alberto.football.util.extension.setupToolbar
import javax.inject.Inject

class TeamsActivity : AppCompatActivity() {
    private val competition: Competition? by lazy { intent.getParcelableExtra(COMPETITION_KEY) }

    @Inject
    lateinit var factory: ViewModelProvider.Factory
    private val viewModel: TeamsViewModel by viewModels { factory }
    private lateinit var binding: ActivityTeamsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        (application as App).appComponent.inject(this)
        super.onCreate(savedInstanceState)
        binding = ActivityTeamsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupToolbar(toolbar = binding.toolbar, icon = R.drawable.back_icon)
        setupViews()
        setObservers()

        if (savedInstanceState == null) {
            competition?.let { viewModel.getTeams(it.id) }
        }
    }

    private fun setupViews() {
        binding.teams.adapter = TeamsAdapter(::teamCallback)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
        competition?.let { binding.compName.text = it.name }
    }

    private fun setObservers() {
        viewModel.state.observe(this) { state ->
            state ?: return@observe
            when (state) {
                is State.Loading -> {
                    binding.progressBar.beVisible()
                    binding.teams.beGone()
                }
                is State.Done -> {
                    binding.progressBar.beGone()
                    binding.teams.beVisible()
                }

                is State.Error -> {
                    binding.progressBar.beGone()
                    binding.teams.beVisible()
                    retry(state.error)
                }
            }

        }
    }

    private fun retry(msg: String) {
        Snackbar.make(binding.root, msg, Snackbar.LENGTH_INDEFINITE).apply {
            setAction(getString(R.string.retry)) {
                competition?.let {
                    viewModel.getTeams(it.id)
                }
            }
            show()
        }
    }

    private fun teamCallback(team: Team) {
        val intent = Intent(this, TeamActivity::class.java).apply {
            putExtra(TEAM_KEY, team)
        }
        startActivity(intent)
    }
}