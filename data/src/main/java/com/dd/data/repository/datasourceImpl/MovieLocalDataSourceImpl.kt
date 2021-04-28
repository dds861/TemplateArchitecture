package com.dd.data.repository.datasourceImpl

import com.dd.data.db.AppDao
import com.dd.data.repository.datasource.MovieLocalDataSource
import javax.inject.Inject

class MovieLocalDataSourceImpl @Inject constructor(private val appDao: AppDao) :
    MovieLocalDataSource {

}