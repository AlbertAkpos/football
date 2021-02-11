package me.alberto.football.data.remote.model

import com.google.gson.annotations.SerializedName

data class TeamDTO(
    @SerializedName("id")
    val id: Long,
    @SerializedName("area")
    val area: AreaDTO,
    @SerializedName("name")
    val name: String,
    @SerializedName("shortName")
    val shortName: String,
    @SerializedName("tla")
    val tla: String,
    @SerializedName("crestUrl")
    val crestURL: String?,
    @SerializedName("address")
    val address: String,
    @SerializedName("phone")
    val phone: String?,
    @SerializedName("website")
    val website: String?,
    @SerializedName("email")
    val email: String?,
    @SerializedName("founded")
    val founded: Long,
    @SerializedName("clubColors")
    val clubColors: String?,
    @SerializedName("venue")
    val venue: String?,
    @SerializedName("lastUpdated")
    val lastUpdated: String
)
