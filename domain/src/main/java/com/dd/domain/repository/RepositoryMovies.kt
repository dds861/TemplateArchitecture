package com.dd.domain.repository

interface RepositoryMovies {
    suspend fun getPopularMovies()
}