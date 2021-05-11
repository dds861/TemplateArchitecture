package com.dd.data.repository.datasource.news

import com.dd.data.net.model.news.DataResponseTopHeadlinesNewsModel
import retrofit2.Response

interface NewsRemoteDataSource {
    suspend fun getTopHeadlines(): Response<DataResponseTopHeadlinesNewsModel>
}