package com.dd.domain.usecases.news

import com.dd.domain.model.news.DomainResponseNewsEverythingModel
import com.dd.domain.repository.RepositoryNews
import kotlinx.coroutines.flow.Flow

class GetSavedNewsUseCase(private val repository: RepositoryNews) {
    fun execute(): Flow<List<DomainResponseNewsEverythingModel.Article>> {
        return repository.getSavedNews()
    }
}