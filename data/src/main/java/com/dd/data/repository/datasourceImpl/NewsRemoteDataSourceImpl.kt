package com.dd.data.repository.datasourceImpl

import com.dd.data.net.NewsApiService
import com.dd.data.net.model.DataResponseEverythingNewsApi
import com.dd.data.net.model.DataResponseTopHeadlinesNewsApi
import com.dd.data.repository.datasource.NewsRemoteDataSource
import retrofit2.Response

class NewsRemoteDataSourceImpl(
    private val newsApiService: NewsApiService
) : NewsRemoteDataSource {
    override suspend fun getTopHeadlines(
        country: String,
        page: Int
    ): Response<DataResponseTopHeadlinesNewsApi> {
        return newsApiService.getTopHeadlines(country = country, page = page)
    }

    override suspend fun getNewsEverything(
        country: String,
        page: Int
    ): Response<DataResponseEverythingNewsApi> {
        return newsApiService.getEverything(country = country, page = page)
    }


}