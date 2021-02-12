package me.alberto.football.screens.competition.view

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.snackbar.Snackbar
import me.alberto.football.App
import me.alberto.football.R
import me.alberto.football.data.domain.model.Competition
import me.alberto.football.databinding.ActivityCompetitionBinding
import me.alberto.football.screens.competition.adapter.CompAdapter
import me.alberto.football.screens.competition.viewmodel.CompetitionViewModel
import me.alberto.football.screens.teams.view.TeamsActivity
import me.alberto.football.util.COMPETITION_KEY
import me.alberto.football.util.State
import me.alberto.football.util.extension.beGone
import me.alberto.football.util.extension.beVisible
import javax.inject.Inject

class CompetitionsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCompetitionBinding

    @Inject
    lateinit var factory: ViewModelProvider.Factory
    private val viewModel: CompetitionViewModel by viewModels { factory }
    override fun onCreate(savedInstanceState: Bundle?) {
        (application as App).appComponent.inject(this)
        super.onCreate(savedInstanceState)
        binding = ActivityCompetitionBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupViews()
        setObservers()
    }

    private fun setObservers() {
        viewModel.state.observe(this) { state ->
            state ?: return@observe
            when (state) {
                is State.Loading -> {
                    binding.progressBar.beVisible()
                    binding.competitions.beGone()
                }
                is State.Done -> {
                    binding.progressBar.beGone()
                    binding.competitions.beVisible()
                }

                is State.Error -> {
                    binding.progressBar.beGone()
                    binding.competitions.beVisible()
                    retry(state.error)
                }
            }

        }
    }

    private fun retry(msg: String) {
        Snackbar.make(binding.root, msg, Snackbar.LENGTH_INDEFINITE).apply {
            setAction(getString(R.string.retry)) { viewModel.getRemote() }
            show()
        }
    }

    private fun setupViews() {
        binding.competitions.adapter = CompAdapter(::compItemCallback)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
    }


    private fun compItemCallback(competition: Competition) {
        val intent = Intent(this, TeamsActivity::class.java).apply {
            putExtra(COMPETITION_KEY, competition)
        }
        startActivity(intent)
    }
}