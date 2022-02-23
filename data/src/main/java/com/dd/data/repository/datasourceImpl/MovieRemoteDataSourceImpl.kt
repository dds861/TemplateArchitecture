package com.dd.data.repository.datasourceImpl

import com.dd.data.network.ApiService
import com.dd.data.repository.datasource.MovieRemoteDataSource
import javax.inject.Inject

class MovieRemoteDataSourceImpl @Inject constructor(private val service: ApiService) :
    MovieRemoteDataSource {

}