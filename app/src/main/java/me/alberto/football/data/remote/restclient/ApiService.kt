package me.alberto.football.data.remote.restclient

import me.alberto.football.data.remote.response.CompetitionsResponse
import me.alberto.football.data.remote.response.TeamResponse
import me.alberto.football.util.Urls.COMPETITIONS
import me.alberto.football.util.Urls.COMPETITION_TEAMS
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET(COMPETITIONS)
    suspend fun getCompetitions(): CompetitionsResponse

    @GET(COMPETITION_TEAMS)
    suspend fun getTeams(@Path("id") compId: Long): TeamResponse
}