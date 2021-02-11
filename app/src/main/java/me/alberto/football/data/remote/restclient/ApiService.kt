package me.alberto.football.data.remote.restclient

import me.alberto.football.data.remote.response.CompetitionsResponse
import me.alberto.football.util.Urls.COMPETITIONS
import retrofit2.http.GET

interface ApiService {
    @GET(COMPETITIONS)
    suspend fun getCompetitions(): CompetitionsResponse
}