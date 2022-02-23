package com.dd.domain.usecases.news

import com.dd.domain.model.news.DomainResponseNewsEverythingModel
import com.dd.domain.repository.RepositoryNews
import com.dd.domain.util.Resource

class GetNewsEverythingUseCase(private val repository: RepositoryNews) {
    suspend fun execute(
        country: String,
        page: Int
    ): Resource<DomainResponseNewsEverythingModel> {
        return repository.getNewsEverything(
            country = country,
            page = page
        )
    }
}