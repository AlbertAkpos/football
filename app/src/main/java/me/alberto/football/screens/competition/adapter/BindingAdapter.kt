package me.alberto.football.screens.competition.adapter

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import me.alberto.football.data.domain.model.Competition

@BindingAdapter("app:competitions")
fun RecyclerView.competitions(competitions: List<Competition>?) {
    competitions?.let {
        val adapter = adapter as CompAdapter
        adapter.submitList(it)
    }
}