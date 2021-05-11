package com.dd.data.repository.datasourceImpl.news

import com.dd.data.net.NewsApiService
import com.dd.data.net.model.news.DataResponseTopHeadlinesNewsModel
import com.dd.data.repository.datasource.news.NewsRemoteDataSource
import retrofit2.Response

class NewsRemoteDataSourceImpl(
    private val newsApiService: NewsApiService,
    private val country: String,
    private val page: Int
) : NewsRemoteDataSource {
    override suspend fun getTopHeadlines(): Response<DataResponseTopHeadlinesNewsModel> {
        return newsApiService.getTopHeadlines(country = country, page = page)
    }
}