package com.dd.domain.usecases.news

import com.dd.domain.model.news.DomainResponseEverythingNewsModel
import com.dd.domain.repository.RepositoryNews
import kotlinx.coroutines.flow.Flow

class GetSavedNewsUseCase(private val repository: RepositoryNews) {
    fun execute(): Flow<List<DomainResponseEverythingNewsModel.Article>> {
        return repository.getSavedNews()
    }
}