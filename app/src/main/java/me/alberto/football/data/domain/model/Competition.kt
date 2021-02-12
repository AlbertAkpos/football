package me.alberto.football.data.domain.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Competition(
    val id: Long,
    val name: String,
    val country: String,
    val startDate: String?,
    val endDate: String?,
    val color: Int
) : Parcelable
