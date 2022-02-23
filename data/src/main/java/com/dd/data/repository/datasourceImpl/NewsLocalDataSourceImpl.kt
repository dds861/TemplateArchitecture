package com.dd.data.repository.datasourceImpl

import com.dd.data.db.MoviesDao
import com.dd.data.db.NewsDao
import com.dd.data.db.entities.NewsEntity
import com.dd.data.repository.datasource.NewsLocalDataSource
import javax.inject.Inject

class NewsLocalDataSourceImpl @Inject constructor(private val dao: NewsDao) : NewsLocalDataSource {
    override suspend fun saveNews(entity: NewsEntity) {
        dao.insert(entity)
    }
}