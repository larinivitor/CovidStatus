package com.projetoIF.covidStatus.model.repository

import com.projetoIF.covidStatus.model.dao.DataDAO
import com.projetoIF.covidStatus.model.domain.data.Data

class DataRepository private constructor(private val _dataDAO: DataDAO) {

    fun getAllData() = _dataDAO.getAllData()

    suspend fun insertAllData(listData: List<Data>) {
        _dataDAO.insertAllData(listData)
    }

    companion object {
        fun create(dataDAO: DataDAO): DataRepository {
            return DataRepository(dataDAO)
        }
    }
}