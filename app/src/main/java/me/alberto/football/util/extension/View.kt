package me.alberto.football.util.extension

import android.net.Uri
import android.view.View
import android.widget.ImageView
import com.github.twocoffeesoneteam.glidetovectoryou.GlideToVectorYou


fun View.beGone() {
    visibility = View.GONE
}

fun View.beVisible() {
    visibility = View.VISIBLE
}

fun ImageView.loadSvgFromUrl(url: String?) {
    url?.let {
        GlideToVectorYou.init()
            .with(context)
            .load(Uri.parse(it), this)
    }
}





