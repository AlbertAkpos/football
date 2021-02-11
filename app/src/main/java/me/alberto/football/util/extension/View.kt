package me.alberto.football.util.extension

import android.view.View
import android.widget.ImageView
import androidx.annotation.ColorInt
import androidx.annotation.ColorRes
import com.bumptech.glide.Glide
import me.alberto.football.R
import me.alberto.football.util.COLOR_RES
import java.util.*

fun View.beGone() {
    visibility = View.GONE
}

fun View.beVisible() {
    visibility = View.VISIBLE
}

fun ImageView.loadImageFromUrl(url: String?) {
    url?.let {
        Glide.with(context)
            .load(url)
            .into(this)
    }
}



