package com.dd.domain.usecases.news

import com.dd.domain.model.news.DomainResponseNewsEverythingModel
import com.dd.domain.repository.RepositoryNews

class SaveNewsUseCase(private val repository: RepositoryNews) {
    suspend fun execute(article: DomainResponseNewsEverythingModel.Article) =
        repository.saveNews(article)
}