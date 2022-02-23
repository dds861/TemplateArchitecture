package com.dd.domain.usecases.news

import com.dd.domain.model.news.DomainResponseNewsTopHeadlinesModel
import com.dd.domain.repository.RepositoryNews
import com.dd.domain.util.Resource

class GetNewsHeadlinesUseCase(private val repository: RepositoryNews) {
    suspend fun execute(
        country: String,
        page: Int
    ): Resource<DomainResponseNewsTopHeadlinesModel> {
        return repository.getNewsHeadlines(
            country = country,
            page = page
        )
    }
}