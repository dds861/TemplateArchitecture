package com.dd.domain.repository

import com.dd.domain.model.news.DomainResponseEverythingNewsModel
import com.dd.domain.util.Resource
import kotlinx.coroutines.flow.Flow

interface RepositoryNews {
    suspend fun getNewsHeadlines(): Resource<DomainResponseEverythingNewsModel>
    suspend fun getSearchedNews(searchQuery: String): Resource<DomainResponseEverythingNewsModel>
    suspend fun saveNews(article: DomainResponseEverythingNewsModel.Article)
    suspend fun deleteNews(article: DomainResponseEverythingNewsModel.Article)
    fun getSavedNews(): Flow<List<DomainResponseEverythingNewsModel.Article>>
}