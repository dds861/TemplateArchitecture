package com.dd.data.repository.datasourceImpl

import com.dd.data.db.MoviesDao
import com.dd.data.repository.datasource.MovieLocalDataSource
import javax.inject.Inject

class MovieLocalDataSourceImpl @Inject constructor(private val moviesDao: MoviesDao) :
    MovieLocalDataSource {

}