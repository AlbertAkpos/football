package me.alberto.football.screens.teams.adapter

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import me.alberto.football.data.domain.model.Team

@BindingAdapter("app:teams")
fun RecyclerView.setTeams(teams: List<Team>?) {
    teams?.let {
        val adapter = adapter as TeamsAdapter
        adapter.submitList(it)
    }
}