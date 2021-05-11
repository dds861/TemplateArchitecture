package com.dd.data.repository

import com.dd.data.net.model.news.DataResponseTopHeadlinesNewsModel
import com.dd.data.repository.datasource.news.NewsRemoteDataSource
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
    override suspend fun getNewsHeadlines(): Resource<DomainResponseTopHeadlinesNewsModel> {
        return responseToResource(newsRemoteDataSource.getTopHeadlines())
    }

    override suspend fun getNewsEverything(): Resource<DomainResponseEverythingNewsModel> {

    }

    override suspend fun getSearchedNews(searchQuery: String): Resource<DomainResponseEverythingNewsModel> {

    }

    override suspend fun saveNews(article: DomainResponseEverythingNewsModel.Article) {

    }

    override suspend fun deleteNews(article: DomainResponseEverythingNewsModel.Article) {

    }

    override fun getSavedNews(): Flow<List<DomainResponseEverythingNewsModel.Article>> {

    }


    private fun responseToResource(response: Response<DataResponseTopHeadlinesNewsModel>): Resource<DomainResponseTopHeadlinesNewsModel> {
        if (response.isSuccessful) {
            response.body()?.let { result ->
                return Resource.Success(result.toDomainModel())

            }
        }
        return Resource.Error(response.message())
    }

}