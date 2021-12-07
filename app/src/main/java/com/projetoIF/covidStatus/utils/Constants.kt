package com.projetoIF.covidStatus.utils

object Constants {

    object APICOVID {
        const val BASE_URL = "https://api.brasil.io/v1/dataset/covid19/caso/"
        const val GET_ALL = "data?is_last=True&place_type=state"
        const val GET_CITY = "data/?is_last=True&place_type=city"
        const val API_KEY = "d1be9d3852a90ba644f583533ccc87a0de720c83"
    }

    object DATASTOREKEYS {
        const val KEY_CONFIRMED = "dataConfirmed"
        const val KEY_DEATH = "dataDeath"
        const val KEY_DATE = "dataDate"
    }

    object ABOUT {
        const val REPOSITORY_URL = "https://github.com/larinivitor/CovidStatus"
        const val REPOSITORY_UPDATE_URL = "https://github.com/zLuCaS2K/BrazilianCovid19/releases"
    }
}