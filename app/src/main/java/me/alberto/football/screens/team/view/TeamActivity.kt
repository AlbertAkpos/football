package me.alberto.football.screens.team.view

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.snackbar.Snackbar
import me.alberto.football.App
import me.alberto.football.R
import me.alberto.football.data.domain.model.Team
import me.alberto.football.databinding.ActivityTeamBinding
import me.alberto.football.screens.team.adapter.PlayerAdapter
import me.alberto.football.screens.team.viewmodel.TeamViewModel
import me.alberto.football.util.State
import me.alberto.football.util.State.Done
import me.alberto.football.util.State.Error
import me.alberto.football.util.State.Loading
import me.alberto.football.util.TEAM_KEY
import me.alberto.football.util.extension.beGone
import me.alberto.football.util.extension.beVisible
import me.alberto.football.util.extension.setupToolbar
import javax.inject.Inject

class TeamActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTeamBinding
    private val team: Team? by lazy { intent.getParcelableExtra(TEAM_KEY) }

    @Inject
    lateinit var factory: ViewModelProvider.Factory
    private val viewModel: TeamViewModel by viewModels { factory }

    override fun onCreate(savedInstanceState: Bundle?) {
        (application as App).appComponent.inject(this)
        super.onCreate(savedInstanceState)
        binding = ActivityTeamBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupToolbar(binding.toolbar)
        setupViews()
        setupObservers()

        if (savedInstanceState == null) {
            team?.let {
                viewModel.getTeam(it.id)
            }
        }
    }

    private fun setupObservers() {
        viewModel.state.observe(this){ state ->
            state ?: return@observe
            when(state) {
                is Loading -> {
                    binding.mainView.beGone()
                    binding.progressBar.beVisible()
                }
                is Done -> {
                    binding.progressBar.beGone()
                    binding.mainView.beVisible()
                }
                is Error -> {
                    binding.progressBar.beGone()
                    binding.mainView.beGone()
                    retry(state.error)
                }
            }
        }
    }

    private fun retry(msg: String) {
        Snackbar.make(binding.root, msg, Snackbar.LENGTH_INDEFINITE).apply {
            setAction(getString(R.string.retry)) {
                team?.let {
                    viewModel.getTeam(it.id)
                }
            }
            show()
        }
    }

    private fun setupViews() {
        binding.playersRecycler.adapter = PlayerAdapter()
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
        team?.let { binding.clubName.text = it.name }
    }
}

