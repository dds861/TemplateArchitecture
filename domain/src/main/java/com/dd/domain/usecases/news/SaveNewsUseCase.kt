package com.dd.domain.usecases.news

import com.dd.domain.model.news.DomainResponseEverythingNewsModel
import com.dd.domain.repository.RepositoryNews

class SaveNewsUseCase(private val repository: RepositoryNews) {
    suspend fun execute(article: DomainResponseEverythingNewsModel.Article) =
        repository.saveNews(article)
}