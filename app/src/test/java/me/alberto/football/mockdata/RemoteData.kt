package me.alberto.football.mockdata

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import me.alberto.football.data.remote.response.CompetitionsResponse
import me.alberto.football.data.remote.response.TeamResponse
import me.alberto.football.data.remote.response.TeamsResponse

val competitionsResponse: CompetitionsResponse
    get() {
        val gson = Gson()
        val type = object : TypeToken<CompetitionsResponse>() {}.type
        return gson.fromJson(getRemoteGson(), type)
    }

val championsLeagueResponse: TeamsResponse
    get() {
        val gson = Gson()
        val type = object : TypeToken<TeamsResponse>() {}.type
        return gson.fromJson(getChampionsLeagueRemote(), type)
    }

val championsLeagueId: Long
    get() = 2001


val borussiaDortmundId: Long
    get() = 4

val borussiaDortmundResponse: TeamResponse
    get() {
        val gson = Gson()
        val type = object : TypeToken<TeamResponse>(){}.type
        return gson.fromJson(getBVBResponse(), type)
    }


fun getBVBResponse(): String {
    return "{\n" +
            "    \"id\": 4,\n" +
            "    \"area\": {\n" +
            "        \"id\": 2088,\n" +
            "        \"name\": \"Germany\"\n" +
            "    },\n" +
            "    \"activeCompetitions\": [\n" +
            "        {\n" +
            "            \"id\": 2002,\n" +
            "            \"area\": {\n" +
            "                \"id\": 2088,\n" +
            "                \"name\": \"Germany\"\n" +
            "            },\n" +
            "            \"name\": \"Bundesliga\",\n" +
            "            \"code\": \"BL1\",\n" +
            "            \"plan\": \"TIER_ONE\",\n" +
            "            \"lastUpdated\": \"2021-02-13T00:35:17Z\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 2011,\n" +
            "            \"area\": {\n" +
            "                \"id\": 2088,\n" +
            "                \"name\": \"Germany\"\n" +
            "            },\n" +
            "            \"name\": \"DFB-Pokal\",\n" +
            "            \"code\": \"DFB\",\n" +
            "            \"plan\": \"TIER_TWO\",\n" +
            "            \"lastUpdated\": \"2021-02-04T01:05:04Z\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 2001,\n" +
            "            \"area\": {\n" +
            "                \"id\": 2077,\n" +
            "                \"name\": \"Europe\"\n" +
            "            },\n" +
            "            \"name\": \"UEFA Champions League\",\n" +
            "            \"code\": \"CL\",\n" +
            "            \"plan\": \"TIER_ONE\",\n" +
            "            \"lastUpdated\": \"2020-12-10T10:40:03Z\"\n" +
            "        }\n" +
            "    ],\n" +
            "    \"name\": \"Borussia Dortmund\",\n" +
            "    \"shortName\": \"Dortmund\",\n" +
            "    \"tla\": \"BVB\",\n" +
            "    \"crestUrl\": \"https://crests.football-data.org/4.svg\",\n" +
            "    \"address\": \"Rheinlanddamm 207-209 Dortmund 44137\",\n" +
            "    \"phone\": \"+49 (231) 90200\",\n" +
            "    \"website\": \"http://www.bvb.de\",\n" +
            "    \"email\": \"info@bvb.de\",\n" +
            "    \"founded\": 1909,\n" +
            "    \"clubColors\": \"Black / Yellow\",\n" +
            "    \"venue\": \"Signal Iduna Park\",\n" +
            "    \"squad\": [\n" +
            "        {\n" +
            "            \"id\": 136,\n" +
            "            \"name\": \"Łukasz Piszczek\",\n" +
            "            \"position\": \"Defender\",\n" +
            "            \"dateOfBirth\": \"1985-06-03T00:00:00Z\",\n" +
            "            \"countryOfBirth\": \"Poland\",\n" +
            "            \"nationality\": \"Poland\",\n" +
            "            \"shirtNumber\": null,\n" +
            "            \"role\": \"PLAYER\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 138,\n" +
            "            \"name\": \"Marco Reus\",\n" +
            "            \"position\": \"Midfielder\",\n" +
            "            \"dateOfBirth\": \"1989-05-31T00:00:00Z\",\n" +
            "            \"countryOfBirth\": \"Germany\",\n" +
            "            \"nationality\": \"Germany\",\n" +
            "            \"shirtNumber\": null,\n" +
            "            \"role\": \"PLAYER\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 141,\n" +
            "            \"name\": \"Roman Bürki\",\n" +
            "            \"position\": \"Goalkeeper\",\n" +
            "            \"dateOfBirth\": \"1990-11-14T00:00:00Z\",\n" +
            "            \"countryOfBirth\": \"Switzerland\",\n" +
            "            \"nationality\": \"Switzerland\",\n" +
            "            \"shirtNumber\": null,\n" +
            "            \"role\": \"PLAYER\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 143,\n" +
            "            \"name\": \"Manuel Akanji\",\n" +
            "            \"position\": \"Defender\",\n" +
            "            \"dateOfBirth\": \"1995-07-19T00:00:00Z\",\n" +
            "            \"countryOfBirth\": \"Switzerland\",\n" +
            "            \"nationality\": \"Switzerland\",\n" +
            "            \"shirtNumber\": null,\n" +
            "            \"role\": \"PLAYER\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 146,\n" +
            "            \"name\": \"Jadon Sancho\",\n" +
            "            \"position\": \"Midfielder\",\n" +
            "            \"dateOfBirth\": \"2000-03-25T00:00:00Z\",\n" +
            "            \"countryOfBirth\": \"England\",\n" +
            "            \"nationality\": \"England\",\n" +
            "            \"shirtNumber\": null,\n" +
            "            \"role\": \"PLAYER\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 148,\n" +
            "            \"name\": \"Julian Brandt\",\n" +
            "            \"position\": \"Attacker\",\n" +
            "            \"dateOfBirth\": \"1996-05-02T00:00:00Z\",\n" +
            "            \"countryOfBirth\": \"Germany\",\n" +
            "            \"nationality\": \"Germany\",\n" +
            "            \"shirtNumber\": null,\n" +
            "            \"role\": \"PLAYER\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 158,\n" +
            "            \"name\": \"Mahmoud Dahoud\",\n" +
            "            \"position\": \"Midfielder\",\n" +
            "            \"dateOfBirth\": \"1996-01-01T00:00:00Z\",\n" +
            "            \"countryOfBirth\": \"Syria\",\n" +
            "            \"nationality\": \"Germany\",\n" +
            "            \"shirtNumber\": null,\n" +
            "            \"role\": \"PLAYER\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 164,\n" +
            "            \"name\": \"Sergio Gómez\",\n" +
            "            \"position\": \"Attacker\",\n" +
            "            \"dateOfBirth\": \"2000-09-04T00:00:00Z\",\n" +
            "            \"countryOfBirth\": \"Spain\",\n" +
            "            \"nationality\": \"Spain\",\n" +
            "            \"shirtNumber\": null,\n" +
            "            \"role\": \"PLAYER\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 206,\n" +
            "            \"name\": \"Chris Führich\",\n" +
            "            \"position\": \"Midfielder\",\n" +
            "            \"dateOfBirth\": \"1998-01-09T00:00:00Z\",\n" +
            "            \"countryOfBirth\": \"Germany\",\n" +
            "            \"nationality\": \"Germany\",\n" +
            "            \"shirtNumber\": null,\n" +
            "            \"role\": \"PLAYER\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 312,\n" +
            "            \"name\": \"Nico Schulz\",\n" +
            "            \"position\": \"Midfielder\",\n" +
            "            \"dateOfBirth\": \"1993-04-01T00:00:00Z\",\n" +
            "            \"countryOfBirth\": \"Germany\",\n" +
            "            \"nationality\": \"Germany\",\n" +
            "            \"shirtNumber\": null,\n" +
            "            \"role\": \"PLAYER\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 350,\n" +
            "            \"name\": \"Mats Hummels\",\n" +
            "            \"position\": \"Defender\",\n" +
            "            \"dateOfBirth\": \"1988-12-16T00:00:00Z\",\n" +
            "            \"countryOfBirth\": \"Germany\",\n" +
            "            \"nationality\": \"Germany\",\n" +
            "            \"shirtNumber\": null,\n" +
            "            \"role\": \"PLAYER\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 401,\n" +
            "            \"name\": \"Felix Passlack\",\n" +
            "            \"position\": \"Midfielder\",\n" +
            "            \"dateOfBirth\": \"1998-05-29T00:00:00Z\",\n" +
            "            \"countryOfBirth\": \"Germany\",\n" +
            "            \"nationality\": \"Germany\",\n" +
            "            \"shirtNumber\": null,\n" +
            "            \"role\": \"PLAYER\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 3183,\n" +
            "            \"name\": \"Emre Can\",\n" +
            "            \"position\": \"Midfielder\",\n" +
            "            \"dateOfBirth\": \"1994-01-12T00:00:00Z\",\n" +
            "            \"countryOfBirth\": \"Germany\",\n" +
            "            \"nationality\": \"Germany\",\n" +
            "            \"shirtNumber\": null,\n" +
            "            \"role\": \"PLAYER\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 3246,\n" +
            "            \"name\": \"Raphaël Guerreiro\",\n" +
            "            \"position\": \"Defender\",\n" +
            "            \"dateOfBirth\": \"1993-12-22T00:00:00Z\",\n" +
            "            \"countryOfBirth\": \"France\",\n" +
            "            \"nationality\": \"Portugal\",\n" +
            "            \"shirtNumber\": null,\n" +
            "            \"role\": \"PLAYER\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 3460,\n" +
            "            \"name\": \"Thomas Delaney\",\n" +
            "            \"position\": \"Midfielder\",\n" +
            "            \"dateOfBirth\": \"1991-09-03T00:00:00Z\",\n" +
            "            \"countryOfBirth\": \"Denmark\",\n" +
            "            \"nationality\": \"Denmark\",\n" +
            "            \"shirtNumber\": null,\n" +
            "            \"role\": \"PLAYER\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 3471,\n" +
            "            \"name\": \"Marwin Hitz\",\n" +
            "            \"position\": \"Goalkeeper\",\n" +
            "            \"dateOfBirth\": \"1987-09-18T00:00:00Z\",\n" +
            "            \"countryOfBirth\": \"Switzerland\",\n" +
            "            \"nationality\": \"Switzerland\",\n" +
            "            \"shirtNumber\": null,\n" +
            "            \"role\": \"PLAYER\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 3650,\n" +
            "            \"name\": \"Thomas Meunier\",\n" +
            "            \"position\": \"Defender\",\n" +
            "            \"dateOfBirth\": \"1991-09-12T00:00:00Z\",\n" +
            "            \"countryOfBirth\": \"Belgium\",\n" +
            "            \"nationality\": \"Belgium\",\n" +
            "            \"shirtNumber\": null,\n" +
            "            \"role\": \"PLAYER\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 3655,\n" +
            "            \"name\": \"Thorgan Hazard\",\n" +
            "            \"position\": \"Midfielder\",\n" +
            "            \"dateOfBirth\": \"1993-03-29T00:00:00Z\",\n" +
            "            \"countryOfBirth\": \"Belgium\",\n" +
            "            \"nationality\": \"Belgium\",\n" +
            "            \"shirtNumber\": null,\n" +
            "            \"role\": \"PLAYER\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 3656,\n" +
            "            \"name\": \"Axel Witsel\",\n" +
            "            \"position\": \"Midfielder\",\n" +
            "            \"dateOfBirth\": \"1989-01-12T00:00:00Z\",\n" +
            "            \"countryOfBirth\": \"Belgium\",\n" +
            "            \"nationality\": \"Belgium\",\n" +
            "            \"shirtNumber\": null,\n" +
            "            \"role\": \"PLAYER\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 6481,\n" +
            "            \"name\": \"Marcel Schmelzer\",\n" +
            "            \"position\": \"Defender\",\n" +
            "            \"dateOfBirth\": \"1988-01-22T00:00:00Z\",\n" +
            "            \"countryOfBirth\": \"Germany\",\n" +
            "            \"nationality\": \"Germany\",\n" +
            "            \"shirtNumber\": null,\n" +
            "            \"role\": \"PLAYER\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 6483,\n" +
            "            \"name\": \"Dan-Axel Zagadou\",\n" +
            "            \"position\": \"Defender\",\n" +
            "            \"dateOfBirth\": \"1999-06-03T00:00:00Z\",\n" +
            "            \"countryOfBirth\": \"France\",\n" +
            "            \"nationality\": \"France\",\n" +
            "            \"shirtNumber\": null,\n" +
            "            \"role\": \"PLAYER\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 10561,\n" +
            "            \"name\": \"Steffen Tigges\",\n" +
            "            \"position\": \"Attacker\",\n" +
            "            \"dateOfBirth\": \"1998-07-31T00:00:00Z\",\n" +
            "            \"countryOfBirth\": \"Germany\",\n" +
            "            \"nationality\": \"Germany\",\n" +
            "            \"shirtNumber\": null,\n" +
            "            \"role\": \"PLAYER\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 38101,\n" +
            "            \"name\": \"Erling Haaland\",\n" +
            "            \"position\": \"Attacker\",\n" +
            "            \"dateOfBirth\": \"2000-07-21T00:00:00Z\",\n" +
            "            \"countryOfBirth\": \"England\",\n" +
            "            \"nationality\": \"Norway\",\n" +
            "            \"shirtNumber\": null,\n" +
            "            \"role\": \"PLAYER\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 67401,\n" +
            "            \"name\": \"Stefan Drljača\",\n" +
            "            \"position\": \"Goalkeeper\",\n" +
            "            \"dateOfBirth\": \"1999-04-20T00:00:00Z\",\n" +
            "            \"countryOfBirth\": \"Germany\",\n" +
            "            \"nationality\": \"Germany\",\n" +
            "            \"shirtNumber\": null,\n" +
            "            \"role\": \"PLAYER\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 67401,\n" +
            "            \"name\": \"Stefan Drljača\",\n" +
            "            \"position\": \"Goalkeeper\",\n" +
            "            \"dateOfBirth\": \"1999-04-20T00:00:00Z\",\n" +
            "            \"countryOfBirth\": \"Germany\",\n" +
            "            \"nationality\": \"Germany\",\n" +
            "            \"shirtNumber\": null,\n" +
            "            \"role\": \"PLAYER\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 67401,\n" +
            "            \"name\": \"Stefan Drljača\",\n" +
            "            \"position\": \"Goalkeeper\",\n" +
            "            \"dateOfBirth\": \"1999-04-20T00:00:00Z\",\n" +
            "            \"countryOfBirth\": \"Germany\",\n" +
            "            \"nationality\": \"Germany\",\n" +
            "            \"shirtNumber\": null,\n" +
            "            \"role\": \"PLAYER\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 76731,\n" +
            "            \"name\": \"Dominik Wanner\",\n" +
            "            \"position\": \"Attacker\",\n" +
            "            \"dateOfBirth\": \"1999-05-04T00:00:00Z\",\n" +
            "            \"countryOfBirth\": \"Germany\",\n" +
            "            \"nationality\": \"Germany\",\n" +
            "            \"shirtNumber\": null,\n" +
            "            \"role\": \"PLAYER\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 111021,\n" +
            "            \"name\": \"Luca Unbehaun\",\n" +
            "            \"position\": \"Goalkeeper\",\n" +
            "            \"dateOfBirth\": \"2001-01-27T00:00:00Z\",\n" +
            "            \"countryOfBirth\": \"Germany\",\n" +
            "            \"nationality\": \"Germany\",\n" +
            "            \"shirtNumber\": null,\n" +
            "            \"role\": \"PLAYER\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 111241,\n" +
            "            \"name\": \"Edin Terzić\",\n" +
            "            \"position\": null,\n" +
            "            \"dateOfBirth\": \"1982-10-30T00:00:00Z\",\n" +
            "            \"countryOfBirth\": \"Germany\",\n" +
            "            \"nationality\": \"Croatia\",\n" +
            "            \"shirtNumber\": null,\n" +
            "            \"role\": \"COACH\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 120963,\n" +
            "            \"name\": \"Tobias Raschl\",\n" +
            "            \"position\": \"Midfielder\",\n" +
            "            \"dateOfBirth\": \"2000-02-21T00:00:00Z\",\n" +
            "            \"countryOfBirth\": \"Germany\",\n" +
            "            \"nationality\": \"Germany\",\n" +
            "            \"shirtNumber\": null,\n" +
            "            \"role\": \"PLAYER\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 120984,\n" +
            "            \"name\": \"Mateu Morey\",\n" +
            "            \"position\": \"Defender\",\n" +
            "            \"dateOfBirth\": \"2000-03-02T00:00:00Z\",\n" +
            "            \"countryOfBirth\": \"Spain\",\n" +
            "            \"nationality\": \"Spain\",\n" +
            "            \"shirtNumber\": null,\n" +
            "            \"role\": \"PLAYER\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 123350,\n" +
            "            \"name\": \"Reinier\",\n" +
            "            \"position\": \"Midfielder\",\n" +
            "            \"dateOfBirth\": \"2002-01-19T00:00:00Z\",\n" +
            "            \"countryOfBirth\": \"Brazil\",\n" +
            "            \"nationality\": \"Brazil\",\n" +
            "            \"shirtNumber\": null,\n" +
            "            \"role\": \"PLAYER\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 125010,\n" +
            "            \"name\": \"Jude Bellingham\",\n" +
            "            \"position\": \"Midfielder\",\n" +
            "            \"dateOfBirth\": \"2003-06-29T00:00:00Z\",\n" +
            "            \"countryOfBirth\": \"England\",\n" +
            "            \"nationality\": \"England\",\n" +
            "            \"shirtNumber\": null,\n" +
            "            \"role\": \"PLAYER\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 136733,\n" +
            "            \"name\": \"Gio Reyna\",\n" +
            "            \"position\": \"Attacker\",\n" +
            "            \"dateOfBirth\": \"2002-11-13T00:00:00Z\",\n" +
            "            \"countryOfBirth\": \"England\",\n" +
            "            \"nationality\": \"United States\",\n" +
            "            \"shirtNumber\": null,\n" +
            "            \"role\": \"PLAYER\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 150817,\n" +
            "            \"name\": \"Youssoufa Moukoko\",\n" +
            "            \"position\": \"Attacker\",\n" +
            "            \"dateOfBirth\": \"2004-11-20T00:00:00Z\",\n" +
            "            \"countryOfBirth\": \"Cameroon\",\n" +
            "            \"nationality\": \"Germany\",\n" +
            "            \"shirtNumber\": null,\n" +
            "            \"role\": \"PLAYER\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 150817,\n" +
            "            \"name\": \"Youssoufa Moukoko\",\n" +
            "            \"position\": \"Attacker\",\n" +
            "            \"dateOfBirth\": \"2004-11-20T00:00:00Z\",\n" +
            "            \"countryOfBirth\": \"Cameroon\",\n" +
            "            \"nationality\": \"Germany\",\n" +
            "            \"shirtNumber\": null,\n" +
            "            \"role\": \"PLAYER\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 150817,\n" +
            "            \"name\": \"Youssoufa Moukoko\",\n" +
            "            \"position\": \"Attacker\",\n" +
            "            \"dateOfBirth\": \"2004-11-20T00:00:00Z\",\n" +
            "            \"countryOfBirth\": \"Cameroon\",\n" +
            "            \"nationality\": \"Germany\",\n" +
            "            \"shirtNumber\": null,\n" +
            "            \"role\": \"PLAYER\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 150860,\n" +
            "            \"name\": \"Ansgar Knauff\",\n" +
            "            \"position\": \"Attacker\",\n" +
            "            \"dateOfBirth\": \"2002-01-10T00:00:00Z\",\n" +
            "            \"countryOfBirth\": \"Germany\",\n" +
            "            \"nationality\": \"Germany\",\n" +
            "            \"shirtNumber\": null,\n" +
            "            \"role\": \"PLAYER\"\n" +
            "        }\n" +
            "    ],\n" +
            "    \"lastUpdated\": \"2020-12-08T17:54:19Z\"\n" +
            "}"
}


fun getChampionsLeagueRemote(): String {
    return "{\n" +
            "    \"count\": 79,\n" +
            "    \"filters\": {},\n" +
            "    \"competition\": {\n" +
            "        \"id\": 2001,\n" +
            "        \"area\": {\n" +
            "            \"id\": 2077,\n" +
            "            \"name\": \"Europe\"\n" +
            "        },\n" +
            "        \"name\": \"UEFA Champions League\",\n" +
            "        \"code\": \"CL\",\n" +
            "        \"plan\": \"TIER_ONE\",\n" +
            "        \"lastUpdated\": \"2020-12-10T10:40:03Z\"\n" +
            "    },\n" +
            "    \"season\": {\n" +
            "        \"id\": 642,\n" +
            "        \"startDate\": \"2020-08-08\",\n" +
            "        \"endDate\": \"2021-05-29\",\n" +
            "        \"currentMatchday\": 6,\n" +
            "        \"winner\": null\n" +
            "    },\n" +
            "    \"teams\": [\n" +
            "        {\n" +
            "            \"id\": 4,\n" +
            "            \"area\": {\n" +
            "                \"id\": 2088,\n" +
            "                \"name\": \"Germany\"\n" +
            "            },\n" +
            "            \"name\": \"Borussia Dortmund\",\n" +
            "            \"shortName\": \"Dortmund\",\n" +
            "            \"tla\": \"BVB\",\n" +
            "            \"crestUrl\": \"https://crests.football-data.org/4.svg\",\n" +
            "            \"address\": \"Rheinlanddamm 207-209 Dortmund 44137\",\n" +
            "            \"phone\": \"+49 (231) 90200\",\n" +
            "            \"website\": \"http://www.bvb.de\",\n" +
            "            \"email\": \"info@bvb.de\",\n" +
            "            \"founded\": 1909,\n" +
            "            \"clubColors\": \"Black / Yellow\",\n" +
            "            \"venue\": \"Signal Iduna Park\",\n" +
            "            \"lastUpdated\": \"2020-12-08T17:54:19Z\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 5,\n" +
            "            \"area\": {\n" +
            "                \"id\": 2088,\n" +
            "                \"name\": \"Germany\"\n" +
            "            },\n" +
            "            \"name\": \"FC Bayern München\",\n" +
            "            \"shortName\": \"Bayern M\",\n" +
            "            \"tla\": \"FCB\",\n" +
            "            \"crestUrl\": \"https://crests.football-data.org/5.svg\",\n" +
            "            \"address\": \"Säbenerstr. 51 München 81547\",\n" +
            "            \"phone\": \"+49 (089) 699310\",\n" +
            "            \"website\": \"http://www.fcbayern.de\",\n" +
            "            \"email\": \"service-team@fcb.de\",\n" +
            "            \"founded\": 1900,\n" +
            "            \"clubColors\": \"Red / White / Blue\",\n" +
            "            \"venue\": \"Allianz Arena\",\n" +
            "            \"lastUpdated\": \"2020-11-26T02:04:16Z\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 18,\n" +
            "            \"area\": {\n" +
            "                \"id\": 2088,\n" +
            "                \"name\": \"Germany\"\n" +
            "            },\n" +
            "            \"name\": \"Borussia Mönchengladbach\",\n" +
            "            \"shortName\": \"M'gladbach\",\n" +
            "            \"tla\": \"BMG\",\n" +
            "            \"crestUrl\": \"https://crests.football-data.org/18.svg\",\n" +
            "            \"address\": \"Hennes-Weisweiler-Allee 1 Mönchengladbach 41179\",\n" +
            "            \"phone\": \"+49 (02161) 92930\",\n" +
            "            \"website\": \"http://www.borussia.de\",\n" +
            "            \"email\": \"info@borussia.de\",\n" +
            "            \"founded\": 1900,\n" +
            "            \"clubColors\": \"Black / White / Green\",\n" +
            "            \"venue\": \"Stadion im Borussia-Park\",\n" +
            "            \"lastUpdated\": \"2020-11-26T02:04:29Z\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 61,\n" +
            "            \"area\": {\n" +
            "                \"id\": 2072,\n" +
            "                \"name\": \"England\"\n" +
            "            },\n" +
            "            \"name\": \"Chelsea FC\",\n" +
            "            \"shortName\": \"Chelsea\",\n" +
            "            \"tla\": \"CHE\",\n" +
            "            \"crestUrl\": \"https://crests.football-data.org/61.svg\",\n" +
            "            \"address\": \"Fulham Road London SW6 1HS\",\n" +
            "            \"phone\": \"+44 (0871) 9841955\",\n" +
            "            \"website\": \"http://www.chelseafc.com\",\n" +
            "            \"email\": null,\n" +
            "            \"founded\": 1905,\n" +
            "            \"clubColors\": \"Royal Blue / White\",\n" +
            "            \"venue\": \"Stamford Bridge\",\n" +
            "            \"lastUpdated\": \"2020-11-26T02:14:18Z\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 64,\n" +
            "            \"area\": {\n" +
            "                \"id\": 2072,\n" +
            "                \"name\": \"England\"\n" +
            "            },\n" +
            "            \"name\": \"Liverpool FC\",\n" +
            "            \"shortName\": \"Liverpool\",\n" +
            "            \"tla\": \"LIV\",\n" +
            "            \"crestUrl\": \"https://crests.football-data.org/64.svg\",\n" +
            "            \"address\": \"Anfield Road Liverpool L4 0TH\",\n" +
            "            \"phone\": \"+44 (0844) 4993000\",\n" +
            "            \"website\": \"http://www.liverpoolfc.tv\",\n" +
            "            \"email\": \"customercontact@liverpoolfc.tv\",\n" +
            "            \"founded\": 1892,\n" +
            "            \"clubColors\": \"Red / White\",\n" +
            "            \"venue\": \"Anfield\",\n" +
            "            \"lastUpdated\": \"2021-01-20T14:05:30Z\"\n" +
            "        }\n" +
            "  ]\n" +
            "}"
}

fun getRemoteGson(): String {
    return "{\n" +
            "    \"count\": 152,\n" +
            "    \"filters\": {},\n" +
            "    \"competitions\": [\n" +
            "        {\n" +
            "            \"id\": 2006,\n" +
            "            \"area\": {\n" +
            "                \"id\": 2001,\n" +
            "                \"name\": \"Africa\",\n" +
            "                \"countryCode\": \"AFR\",\n" +
            "                \"ensignUrl\": null\n" +
            "            },\n" +
            "            \"name\": \"WC Qualification\",\n" +
            "            \"code\": null,\n" +
            "            \"emblemUrl\": null,\n" +
            "            \"plan\": \"TIER_FOUR\",\n" +
            "            \"currentSeason\": {\n" +
            "                \"id\": 555,\n" +
            "                \"startDate\": \"2019-09-04\",\n" +
            "                \"endDate\": \"2021-11-16\",\n" +
            "                \"currentMatchday\": null,\n" +
            "                \"winner\": null\n" +
            "            },\n" +
            "            \"numberOfAvailableSeasons\": 2,\n" +
            "            \"lastUpdated\": \"2018-06-04T23:54:04Z\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 2023,\n" +
            "            \"area\": {\n" +
            "                \"id\": 2011,\n" +
            "                \"name\": \"Argentina\",\n" +
            "                \"countryCode\": \"ARG\",\n" +
            "                \"ensignUrl\": null\n" +
            "            },\n" +
            "            \"name\": \"Primera B Nacional\",\n" +
            "            \"code\": null,\n" +
            "            \"emblemUrl\": null,\n" +
            "            \"plan\": \"TIER_FOUR\",\n" +
            "            \"currentSeason\": {\n" +
            "                \"id\": 683,\n" +
            "                \"startDate\": \"2020-11-27\",\n" +
            "                \"endDate\": \"2021-02-01\",\n" +
            "                \"currentMatchday\": null,\n" +
            "                \"winner\": null\n" +
            "            },\n" +
            "            \"numberOfAvailableSeasons\": 4,\n" +
            "            \"lastUpdated\": \"2020-09-10T13:44:34Z\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 2024,\n" +
            "            \"area\": {\n" +
            "                \"id\": 2011,\n" +
            "                \"name\": \"Argentina\",\n" +
            "                \"countryCode\": \"ARG\",\n" +
            "                \"ensignUrl\": null\n" +
            "            },\n" +
            "            \"name\": \"Superliga Argentina\",\n" +
            "            \"code\": \"ASL\",\n" +
            "            \"emblemUrl\": null,\n" +
            "            \"plan\": \"TIER_TWO\",\n" +
            "            \"currentSeason\": {\n" +
            "                \"id\": 539,\n" +
            "                \"startDate\": \"2019-07-27\",\n" +
            "                \"endDate\": \"2020-03-01\",\n" +
            "                \"currentMatchday\": 22,\n" +
            "                \"winner\": null\n" +
            "            },\n" +
            "            \"numberOfAvailableSeasons\": 3,\n" +
            "            \"lastUpdated\": \"2020-09-10T13:44:41Z\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 2149,\n" +
            "            \"area\": {\n" +
            "                \"id\": 2011,\n" +
            "                \"name\": \"Argentina\",\n" +
            "                \"countryCode\": \"ARG\",\n" +
            "                \"ensignUrl\": null\n" +
            "            },\n" +
            "            \"name\": \"Copa Liga Profesional\",\n" +
            "            \"code\": null,\n" +
            "            \"emblemUrl\": null,\n" +
            "            \"plan\": \"TIER_FOUR\",\n" +
            "            \"currentSeason\": {\n" +
            "                \"id\": 653,\n" +
            "                \"startDate\": \"2020-11-01\",\n" +
            "                \"endDate\": \"2021-01-24\",\n" +
            "                \"currentMatchday\": 6,\n" +
            "                \"winner\": null\n" +
            "            },\n" +
            "            \"numberOfAvailableSeasons\": 1,\n" +
            "            \"lastUpdated\": \"2021-01-18T20:29:44Z\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 2025,\n" +
            "            \"area\": {\n" +
            "                \"id\": 2011,\n" +
            "                \"name\": \"Argentina\",\n" +
            "                \"countryCode\": \"ARG\",\n" +
            "                \"ensignUrl\": null\n" +
            "            },\n" +
            "            \"name\": \"Supercopa Argentina\",\n" +
            "            \"code\": null,\n" +
            "            \"emblemUrl\": null,\n" +
            "            \"plan\": \"TIER_FOUR\",\n" +
            "            \"currentSeason\": {\n" +
            "                \"id\": 430,\n" +
            "                \"startDate\": \"2019-04-04\",\n" +
            "                \"endDate\": \"2019-04-04\",\n" +
            "                \"currentMatchday\": null,\n" +
            "                \"winner\": null\n" +
            "            },\n" +
            "            \"numberOfAvailableSeasons\": 2,\n" +
            "            \"lastUpdated\": \"2019-05-03T05:08:18Z\"\n" +
            "        }\n" +
            "   ]\n" +
            "}"
}