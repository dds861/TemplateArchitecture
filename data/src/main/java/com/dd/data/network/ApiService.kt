package com.dd.data.network

import com.dd.data.network.model.DataResponseMoviesPopularApi
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("3/movie/popular")
    suspend fun getPopularMovies(
        @Query("api_key") api_key: String,
        @Query("language") language: String,
        @Query("page") page: Int,
    ): DataResponseMoviesPopularApi

    @GET("3/movie/top_rated")
    suspend fun getTopRatedMovies(
        @Query("api_key") api_key: String,
        @Query("language") language: String,
        @Query("page") page: Int,
    ): DataResponseMoviesPopularApi

    @GET("3/movie/upcoming")
    suspend fun getUpcomingMovies(
        @Query("api_key") api_key: String,
        @Query("language") language: String,
        @Query("page") page: Int,
    ): DataResponseMoviesPopularApi

    @GET("3/movie/latest")
    suspend fun getLatestMovies(
        @Query("api_key") api_key: String,
        @Query("language") language: String
    ): DataResponseMoviesPopularApi
}