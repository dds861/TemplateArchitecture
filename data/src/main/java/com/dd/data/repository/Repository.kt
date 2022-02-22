package com.dd.data.repository

import com.dd.data.repository.datasource.movie.MovieCacheDataSource
import com.dd.data.repository.datasource.movie.MovieLocalDataSource
import com.dd.data.repository.datasource.movie.MovieRemoteDataSource
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