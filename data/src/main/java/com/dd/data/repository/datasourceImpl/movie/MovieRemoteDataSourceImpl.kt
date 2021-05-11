package com.dd.data.repository.datasourceImpl.movie

import com.dd.data.net.ApiService
import com.dd.data.repository.datasource.movie.MovieRemoteDataSource
import javax.inject.Inject

class MovieRemoteDataSourceImpl @Inject constructor(private val service: ApiService) :
    MovieRemoteDataSource {

}