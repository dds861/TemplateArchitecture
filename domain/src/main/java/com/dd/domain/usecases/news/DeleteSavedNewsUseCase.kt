package com.dd.domain.usecases.news

import com.dd.domain.model.news.DomainResponseNewsEverythingModel
import com.dd.domain.repository.RepositoryNews

class DeleteSavedNewsUseCase(private val repository: RepositoryNews) {
    suspend fun execute(article: DomainResponseNewsEverythingModel.Article) =
        repository.deleteNews(article)
}