package com.dd.data.repository

import com.dd.data.network.model.DataResponseNewsEverythingApi
import com.dd.data.network.model.DataResponseNewsTopHeadlinesApi
import com.dd.data.repository.datasource.NewsRemoteDataSource
import com.dd.data.utils.toDomainModel
import com.dd.domain.model.news.DomainResponseNewsEverythingModel
import com.dd.domain.model.news.DomainResponseNewsTopHeadlinesModel
import com.dd.domain.repository.RepositoryNews
import com.dd.domain.util.Resource
import kotlinx.coroutines.flow.Flow
import retrofit2.Response
import javax.inject.Inject

class RepositoryNews @Inject constructor(
    private val newsRemoteDataSource: NewsRemoteDataSource
) : RepositoryNews {
    override suspend fun getNewsHeadlines(
        country: String,
        page: Int
    ): Resource<DomainResponseNewsTopHeadlinesModel> {
        return responseToResource(
            newsRemoteDataSource.getTopHeadlines(
                country = country,
                page = page
            )
        )
    }

    override suspend fun getNewsEverything(
        country: String,
        page: Int
    ): Resource<DomainResponseNewsEverythingModel> {
        return responseToResource(
            newsRemoteDataSource.getNewsEverything(
                country = country,
                page = page
            )
        )

    }

    override suspend fun getSearchedNews(searchQuery: String): Resource<DomainResponseNewsEverythingModel> {
        TODO("Not yet implemented")
    }

    override suspend fun saveNews(article: DomainResponseNewsEverythingModel.Article) {
        TODO("Not yet implemented")
    }

    override suspend fun deleteNews(article: DomainResponseNewsEverythingModel.Article) {
        TODO("Not yet implemented")
    }

    override fun getSavedNews(): Flow<List<DomainResponseNewsEverythingModel.Article>> {
        TODO("Not yet implemented")
    }


    private fun <T, U> responseToResource(response: Response<U>): Resource<T> {
        if (response.isSuccessful) {
            response.body()?.let { result ->
                return when (result) {
                    is DataResponseNewsTopHeadlinesApi -> Resource.Success(result.toDomainModel()) as Resource<T>
                    is DataResponseNewsEverythingApi -> Resource.Success(result.toDomainModel()) as Resource<T>
                    else -> throw Exception()
                }


            }
        }
        return Resource.Error(response.message())
    }

}