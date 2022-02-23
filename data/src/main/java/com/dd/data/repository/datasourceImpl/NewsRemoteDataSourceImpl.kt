package com.dd.data.repository.datasourceImpl

import com.dd.data.network.NewsApiService
import com.dd.data.network.model.DataResponseNewsEverythingApi
import com.dd.data.network.model.DataResponseNewsTopHeadlinesApi
import com.dd.data.repository.datasource.NewsRemoteDataSource
import retrofit2.Response

class NewsRemoteDataSourceImpl(
    private val newsApiService: NewsApiService
) : NewsRemoteDataSource {
    override suspend fun getTopHeadlines(
        country: String,
        page: Int
    ): Response<DataResponseNewsTopHeadlinesApi> {
        return newsApiService.getTopHeadlines(country = country, page = page)
    }

    override suspend fun getNewsEverything(
        country: String,
        page: Int
    ): Response<DataResponseNewsEverythingApi> {
        return newsApiService.getEverything(country = country, page = page)
    }


}