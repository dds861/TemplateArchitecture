package com.dd.data.repository.datasource

import com.dd.data.db.entities.NewsEntity

interface NewsLocalDataSource {
    suspend fun saveNews(entity: NewsEntity)
}