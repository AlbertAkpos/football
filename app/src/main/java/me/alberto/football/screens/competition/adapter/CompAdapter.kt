package me.alberto.football.screens.competition.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import me.alberto.football.data.domain.model.Competition
import me.alberto.football.databinding.CompetitionItemBinding

class CompAdapter(private val clickCallback: (Competition) -> Unit) :
    ListAdapter<Competition, RecyclerView.ViewHolder>(DiffCallback()) {

    class DiffCallback : DiffUtil.ItemCallback<Competition>() {
        override fun areItemsTheSame(oldItem: Competition, newItem: Competition): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Competition, newItem: Competition): Boolean {
            return oldItem == newItem
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return CompetitionViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is CompetitionViewHolder -> holder.bind(getItem(position), clickCallback)
        }
    }

    class CompetitionViewHolder(private val binding: CompetitionItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(competition: Competition, clickCallback: (Competition) -> Unit) {
            binding.competition = competition
            binding.root.setOnClickListener { clickCallback(competition) }
            binding.color.setBackgroundColor(competition.color)
        }

        companion object {
            fun from(parent: ViewGroup): RecyclerView.ViewHolder {
                val view =
                    CompetitionItemBinding.inflate(
                        LayoutInflater.from(parent.context),
                        parent,
                        false
                    )
                return CompetitionViewHolder(view)
            }
        }
    }
}