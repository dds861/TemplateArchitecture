package com.dd.data.repository.datasourceImpl

import com.dd.data.db.dao.NewsDao
import com.dd.data.db.entities.NewsEntity
import com.dd.data.repository.datasource.NewsLocalDataSource
import javax.inject.Inject

class NewsLocalDataSourceImpl @Inject constructor(private val dao: NewsDao) : NewsLocalDataSource {
    override suspend fun saveNews(entity: NewsEntity) {
        dao.insert(entity)
    }
}