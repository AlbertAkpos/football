package me.alberto.football.data.remote.source

import me.alberto.football.data.remote.response.CompetitionsResponse
import me.alberto.football.data.remote.response.TeamResponse
import me.alberto.football.data.remote.response.TeamsResponse
import me.alberto.football.data.remote.restclient.RemoteClient
import javax.inject.Inject

class RemoteSource @Inject constructor(private val restClient: RemoteClient) : IRemoteSource {
    override suspend fun getCompetitions(): CompetitionsResponse {
        return restClient.getRemote().getCompetitions()
    }

    override suspend fun getTeams(compId: Long): TeamsResponse {
        return restClient.getRemote().getTeams(compId)
    }

    override suspend fun getTeam(teamId: Long): TeamResponse {
        return restClient.getRemote().getTeam(teamId)
    }
}