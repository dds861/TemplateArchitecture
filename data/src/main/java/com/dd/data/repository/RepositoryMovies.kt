package com.dd.data.repository

import com.dd.data.repository.datasource.MovieCacheDataSource
import com.dd.data.repository.datasource.MovieLocalDataSource
import com.dd.data.repository.datasource.MovieRemoteDataSource
import com.dd.domain.repository.RepositoryMovies
import javax.inject.Inject

class RepositoryMovies @Inject constructor(
    movieCacheDataSource: MovieCacheDataSource,
    movieLocalDataSource: MovieLocalDataSource,
    movieRemoteDataSource: MovieRemoteDataSource
) : RepositoryMovies {

    override suspend fun getPopularMovies() {

    }


}