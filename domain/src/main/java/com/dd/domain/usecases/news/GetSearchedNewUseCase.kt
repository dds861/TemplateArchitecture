package com.dd.domain.usecases.news

import com.dd.domain.model.news.DomainResponseEverythingNewsModel
import com.dd.domain.repository.RepositoryNews
import com.dd.domain.util.Resource

class GetSearchedNewUseCase(private val repository: RepositoryNews) {
    suspend fun execute(searchQuery: String): Resource<DomainResponseEverythingNewsModel> {
        return repository.getSearchedNews(searchQuery)
    }
}