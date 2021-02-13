package me.alberto.football.util.extension

import android.app.Activity
import androidx.annotation.DrawableRes
import androidx.core.content.ContextCompat
import com.google.android.material.appbar.MaterialToolbar
import me.alberto.football.R

fun Activity.setupToolbar(
    toolbar: MaterialToolbar,
    @DrawableRes icon: Int = R.drawable.back_icon,
) {
    toolbar.navigationIcon = ContextCompat.getDrawable(this, icon)
    toolbar.setNavigationOnClickListener { onBackPressed() }
}