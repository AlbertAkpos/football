package me.alberto.football.screens.team.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import me.alberto.football.data.domain.model.Player
import me.alberto.football.databinding.PlayerItemBinding

class PlayerAdapter :
    ListAdapter<Player, RecyclerView.ViewHolder>(DiffCallback()) {

    class DiffCallback : DiffUtil.ItemCallback<Player>() {
        override fun areItemsTheSame(oldItem: Player, newItem: Player): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Player, newItem: Player): Boolean {
            return oldItem == newItem
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return PlayerViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is PlayerViewHolder -> holder.bind(getItem(position))
        }
    }

    class PlayerViewHolder(private val binding: PlayerItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(player: Player) {
            binding.player = player
        }

        companion object {
            fun from(parent: ViewGroup): RecyclerView.ViewHolder {
                val view =
                    PlayerItemBinding.inflate(
                        LayoutInflater.from(parent.context),
                        parent,
                        false
                    )
                return PlayerViewHolder(view)
            }
        }
    }
}