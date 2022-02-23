package com.dd.domain.repository

import com.dd.domain.model.news.DomainResponseNewsEverythingModel
import com.dd.domain.model.news.DomainResponseNewsTopHeadlinesModel
import com.dd.domain.util.Resource
import kotlinx.coroutines.flow.Flow

interface RepositoryNews {
    suspend fun getNewsHeadlines(
        country: String,
        page: Int
    ): Resource<DomainResponseNewsTopHeadlinesModel>

    suspend fun getNewsEverything(
        country: String,
        page: Int
    ): Resource<DomainResponseNewsEverythingModel>

    suspend fun getSearchedNews(searchQuery: String): Resource<DomainResponseNewsEverythingModel>
    suspend fun saveNews(article: DomainResponseNewsEverythingModel.Article)
    suspend fun deleteNews(article: DomainResponseNewsEverythingModel.Article)
    fun getSavedNews(): Flow<List<DomainResponseNewsEverythingModel.Article>>
}