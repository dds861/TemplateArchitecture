package com.dd.domain.repository

interface Repository {

    suspend fun getPopularMovies()
}