package com.dd.data.repository

import com.dd.data.repository.datasource.MovieCacheDataSource
import com.dd.data.repository.datasource.MovieLocalDataSource
import com.dd.data.repository.datasource.MovieRemoteDataSource
import com.dd.domain.model.DomainResponsePopularMoviesApi
import com.dd.domain.repository.Repository
import javax.inject.Inject

class Repository @Inject constructor(
    movieCacheDataSource: MovieCacheDataSource,
    movieLocalDataSource: MovieLocalDataSource,
    movieRemoteDataSource: MovieRemoteDataSource
) : Repository {

    override suspend fun getPopularMovies() {
    
    }


}