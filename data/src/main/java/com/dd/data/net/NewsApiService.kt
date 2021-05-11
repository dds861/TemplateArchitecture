package com.dd.data.net

import com.dd.data.BuildConfig
import com.dd.data.net.model.news.DataResponseEverythingNewsApi
import com.dd.data.net.model.news.DataResponseTopHeadlinesNewsModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApiService {

    @GET("v2/top-headlines")
    suspend fun getTopHeadlines(
        @Query("country")
        country: String,
        @Query("page")
        page: Int,
        @Query("apiKey")
        apiKey: String = BuildConfig.MOVIES_API_KEY

    ): Response<DataResponseTopHeadlinesNewsModel>

    @GET("v2/everything")
    suspend fun getEverything(
        @Query("country")
        country: String,
        @Query("page")
        page: String,
        @Query("apiKey")
        apiKey: String = BuildConfig.MOVIES_API_KEY
    ): Response<DataResponseEverythingNewsApi>

}