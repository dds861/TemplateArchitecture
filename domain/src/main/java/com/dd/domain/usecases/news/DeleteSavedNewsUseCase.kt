package com.dd.domain.usecases.news

import com.dd.domain.model.news.DomainResponseEverythingNewsModel
import com.dd.domain.repository.RepositoryNews

class DeleteSavedNewsUseCase(private val repository: RepositoryNews) {
    suspend fun execute(article: DomainResponseEverythingNewsModel.Article) =
        repository.deleteNews(article)
}