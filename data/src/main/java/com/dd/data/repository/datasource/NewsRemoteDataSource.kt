package com.dd.data.repository.datasource

import com.dd.data.network.model.DataResponseNewsEverythingApi
import com.dd.data.network.model.DataResponseNewsTopHeadlinesApi
import retrofit2.Response

interface NewsRemoteDataSource {
    suspend fun getTopHeadlines(
        country: String,
        page: Int
    ): Response<DataResponseNewsTopHeadlinesApi>

    suspend fun getNewsEverything(
        country: String,
        page: Int
    ): Response<DataResponseNewsEverythingApi>
//    suspend fun getSearchedNews(): Response<DataResponseTopHeadlinesNewsApi>
//    suspend fun saveNews(): Response<DataResponseTopHeadlinesNewsApi>
//    suspend fun deleteNews(): Response<DataResponseTopHeadlinesNewsApi>
//    suspend fun getSavedNews(): Response<DataResponseTopHeadlinesNewsApi>
}