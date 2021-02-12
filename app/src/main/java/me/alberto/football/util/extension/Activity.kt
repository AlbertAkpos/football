package me.alberto.football.util.extension

import android.app.Activity
import androidx.annotation.DrawableRes
import androidx.core.content.ContextCompat
import com.google.android.material.appbar.MaterialToolbar

fun Activity.setupToolbar(toolbar: MaterialToolbar, @DrawableRes icon: Int, ) {
    toolbar.navigationIcon = ContextCompat.getDrawable(this, icon)
    toolbar.setNavigationOnClickListener { onBackPressed() }
}