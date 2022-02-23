package com.dd.data.repository

import com.dd.data.network.model.DataResponseEverythingNewsApi
import com.dd.data.network.model.DataResponseTopHeadlinesNewsApi
import com.dd.data.repository.datasource.NewsRemoteDataSource
import com.dd.data.utils.toDomainModel
import com.dd.domain.model.news.DomainResponseEverythingNewsModel
import com.dd.domain.model.news.DomainResponseTopHeadlinesNewsModel
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
    ): Resource<DomainResponseTopHeadlinesNewsModel> {
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
    ): Resource<DomainResponseEverythingNewsModel> {
        return responseToResource(
            newsRemoteDataSource.getNewsEverything(
                country = country,
                page = page
            )
        )

    }

    override suspend fun getSearchedNews(searchQuery: String): Resource<DomainResponseEverythingNewsModel> {
        TODO("Not yet implemented")
    }

    override suspend fun saveNews(article: DomainResponseEverythingNewsModel.Article) {
        TODO("Not yet implemented")
    }

    override suspend fun deleteNews(article: DomainResponseEverythingNewsModel.Article) {
        TODO("Not yet implemented")
    }

    override fun getSavedNews(): Flow<List<DomainResponseEverythingNewsModel.Article>> {
        TODO("Not yet implemented")
    }


    private fun <T, U> responseToResource(response: Response<U>): Resource<T> {
        if (response.isSuccessful) {
            response.body()?.let { result ->
                return when (result) {
                    is DataResponseTopHeadlinesNewsApi -> Resource.Success(result.toDomainModel()) as Resource<T>
                    is DataResponseEverythingNewsApi -> Resource.Success(result.toDomainModel()) as Resource<T>
                    else -> throw Exception()
                }


            }
        }
        return Resource.Error(response.message())
    }

}