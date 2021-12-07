package com.projetoIF.covidStatus.data.network.models

import com.google.gson.annotations.SerializedName
import com.projetoIF.covidStatus.model.domain.data.Data

data class ResponseData(
    @SerializedName("results")
    val data: List<Data>,
)