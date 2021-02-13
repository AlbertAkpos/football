package me.alberto.football.data.domain.repository

import io.mockk.coEvery
import io.mockk.mockk
import junit.framework.Assert.assertEquals
import kotlinx.coroutines.runBlocking
import me.alberto.football.base.BaseTest
import me.alberto.football.data.remote.restclient.RemoteClient
import me.alberto.football.mockdata.*
import me.alberto.football.util.getOrAwaitValue
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.core.Is.`is`
import org.junit.After
import org.junit.Test

class RepositoryTest : BaseTest() {
    private val restClient: RemoteClient = mockk()
    private val remoteSource = FakeRemoteSource(restClient)
    private val localSource = FakeLocalSource()
    private val repository = Repository(remoteSource, localSource)

    @After
    fun tearDown() {
        database.clear()
    }

    @Test
    fun `returns a size of zero before database is populated`() {
        assertEquals(0, repository.getCompetition().getOrAwaitValue().size)
    }

    @Test
    fun `returns correct number of items after database is populated`() {

        coEvery {
            restClient.getRemote().getCompetitions()
        } returns competitionsResponse

        runBlocking {
            repository.getRemoteCompetition()
        }

        assertThat(
            competitionsResponse.competitions.size, `is`
                (repository.getCompetition().getOrAwaitValue().size)
        )
    }

    @Test
    fun `returns correct competition for passed in competition id`() {
        val compId = championsLeagueId
        coEvery {
            restClient.getRemote().getTeams(any())
        } returns championsLeagueResponse

        runBlocking {
            val responseId = repository.getTeams(compId).competition?.id
            assertEquals(championsLeagueId, responseId)
        }
    }

    @Test
    fun `returns correct team for passed in team id`() {
        val teamId = borussiaDortmundId
        coEvery {
            restClient.getRemote().getTeam(any())
        } returns borussiaDortmundResponse

        runBlocking {
            val responseId = repository.getTeam(teamId).id
            assertEquals(teamId, responseId)
        }
    }
}