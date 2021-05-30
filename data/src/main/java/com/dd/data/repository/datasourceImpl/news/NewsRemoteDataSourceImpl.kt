package com.dd.data.repository.datasourceImpl.news

import com.dd.data.net.NewsApiService
import com.dd.data.net.model.news.DataResponseEverythingNewsApi
import com.dd.data.net.model.news.DataResponseTopHeadlinesNewsApi
import com.dd.data.repository.datasource.news.NewsRemoteDataSource
import retrofit2.Response

class NewsRemoteDataSourceImpl(
    private val newsApiService: NewsApiService,
    private val country: String,
    private val page: Int
) : NewsRemoteDataSource {
    override suspend fun getTopHeadlines(): Response<DataResponseTopHeadlinesNewsApi> {
        return newsApiService.getTopHeadlines(country = country, page = page)
    }

    override suspend fun getNewsEverything(): Response<DataResponseEverythingNewsApi> {
        return newsApiService.getEverything(country = country, page = page)
    }


}