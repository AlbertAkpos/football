package me.alberto.football.screens.teams.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import me.alberto.football.data.domain.model.Team
import me.alberto.football.databinding.TeamItemBinding
import me.alberto.football.util.extension.loadSvgFromUrl

class TeamsAdapter(private val clickCallback: (Team) -> Unit) :
    ListAdapter<Team, RecyclerView.ViewHolder>(DiffCallback()) {

    class DiffCallback : DiffUtil.ItemCallback<Team>() {
        override fun areItemsTheSame(oldItem: Team, newItem: Team): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Team, newItem: Team): Boolean {
            return oldItem == newItem
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return TeamViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is TeamViewHolder -> holder.bind(getItem(position), clickCallback)
        }
    }

    class TeamViewHolder(private val binding: TeamItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(team: Team, clickCallback: (Team) -> Unit) {
            binding.team = team
            binding.crest.loadSvgFromUrl(team.crestUrl)
            binding.root.setOnClickListener { clickCallback(team) }
        }

        companion object {
            fun from(parent: ViewGroup): RecyclerView.ViewHolder {
                val view =
                    TeamItemBinding.inflate(
                        LayoutInflater.from(parent.context),
                        parent,
                        false
                    )
                return TeamViewHolder(view)
            }
        }
    }
}