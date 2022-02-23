package com.dd.data.utils

import com.dd.data.network.model.DataResponseNewsEverythingApi
import com.dd.data.network.model.DataResponseNewsTopHeadlinesApi
import com.dd.domain.model.news.DomainResponseNewsEverythingModel
import com.dd.domain.model.news.DomainResponseNewsTopHeadlinesModel

fun DataResponseNewsTopHeadlinesApi.toDomainModel(): DomainResponseNewsTopHeadlinesModel =
    DomainResponseNewsTopHeadlinesModel(
        status = status,
        totalResults = totalResults,
        articles = articles.map { it.toDomainModel() }
    )


fun DataResponseNewsTopHeadlinesApi.Article.toDomainModel(): DomainResponseNewsTopHeadlinesModel.Article =
    DomainResponseNewsTopHeadlinesModel.Article(
        source = source.toDomainModel(),
        author = author,
        title = title,
        description = description,
        url = url,
        urlToImage = urlToImage,
        publishedAt = publishedAt,
        content = content
    )

fun DataResponseNewsTopHeadlinesApi.Article.Source.toDomainModel(): DomainResponseNewsTopHeadlinesModel.Article.Source =
    DomainResponseNewsTopHeadlinesModel.Article.Source(
        id = id,
        name = name
    )


fun DataResponseNewsEverythingApi.toDomainModel(): DomainResponseNewsEverythingModel =
    DomainResponseNewsEverythingModel(
        status = status,
        totalResults = totalResults,
        articles = articles.map { it.toDomainModel() }
    )

fun DataResponseNewsEverythingApi.Article.toDomainModel(): DomainResponseNewsEverythingModel.Article =
    DomainResponseNewsEverythingModel.Article(
        source = source.toDomainModel(),
        author = author,
        title = title,
        description = description,
        url = url,
        urlToImage = urlToImage,
        publishedAt = publishedAt,
        content = content

    )

fun DataResponseNewsEverythingApi.Article.Source.toDomainModel(): DomainResponseNewsEverythingModel.Article.Source =
    DomainResponseNewsEverythingModel.Article.Source(
        id = id,
        name = name
    )