package me.alberto.football.screens.team.adapter

import android.graphics.Color
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.card.MaterialCardView
import me.alberto.football.R
import me.alberto.football.data.domain.model.Player
import me.alberto.football.util.extension.loadSvgFromUrl

@BindingAdapter("app:players")
fun RecyclerView.players(list: List<Player>?) {
    list?.let {
        val adapter = adapter as PlayerAdapter
        adapter.submitList(it)
    }
}

@BindingAdapter("app:teamColors")
fun LinearLayout.teamColors(colors: List<Int>?) {
    colors?.let {
        val parent = this
        val inflater = LayoutInflater.from(context)
        val children = colors.map { color ->
            val child = inflater.inflate(R.layout.color_view, parent, false) as MaterialCardView
            child.setCardBackgroundColor(Color.parseColor("#" + Integer.toHexString(color)))
            child
        }
        parent.removeAllViews()
        for (child in children) {
            parent.addView(child)
        }
    }
}

@BindingAdapter("app:crest")
fun ImageView.clubCreist(imgUrl: String?) {
    imgUrl?.let {
        loadSvgFromUrl(imgUrl)
    }
}