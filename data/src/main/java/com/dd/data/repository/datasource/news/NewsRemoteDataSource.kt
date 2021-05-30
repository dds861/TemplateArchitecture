package com.dd.data.repository.datasource.news

import com.dd.data.net.model.news.DataResponseEverythingNewsApi
import com.dd.data.net.model.news.DataResponseTopHeadlinesNewsApi
import retrofit2.Response

interface NewsRemoteDataSource {
    suspend fun getTopHeadlines(
        country: String,
        page: Int
    ): Response<DataResponseTopHeadlinesNewsApi>

    suspend fun getNewsEverything(
        country: String,
        page: Int
    ): Response<DataResponseEverythingNewsApi>
//    suspend fun getSearchedNews(): Response<DataResponseTopHeadlinesNewsApi>
//    suspend fun saveNews(): Response<DataResponseTopHeadlinesNewsApi>
//    suspend fun deleteNews(): Response<DataResponseTopHeadlinesNewsApi>
//    suspend fun getSavedNews(): Response<DataResponseTopHeadlinesNewsApi>
}