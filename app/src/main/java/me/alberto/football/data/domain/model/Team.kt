package me.alberto.football.data.domain.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Team(
    val id: Long,
    val name: String,
    val crestUrl: String?,
    val clubColors: List<Int>
) : Parcelable
