package com.dd.data.repository.datasource

import com.dd.data.db.entities.NewsEntity
import com.dd.data.network.model.DataResponseEverythingNewsApi
import com.dd.data.network.model.DataResponseTopHeadlinesNewsApi
import retrofit2.Response

interface NewsLocalDataSource {
    suspend fun saveNews(entity: NewsEntity)
}