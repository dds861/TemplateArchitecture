package com.dd.data.repository.datasourceImpl.movie

import com.dd.data.db.AppDao
import com.dd.data.repository.datasource.movie.MovieLocalDataSource
import javax.inject.Inject

class MovieLocalDataSourceImpl @Inject constructor(private val appDao: AppDao) :
    MovieLocalDataSource {

}