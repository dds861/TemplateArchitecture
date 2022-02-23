package com.dd.data.utils

import com.dd.data.net.model.DataResponseEverythingNewsApi
import com.dd.data.net.model.DataResponseTopHeadlinesNewsApi
import com.dd.domain.model.news.DomainResponseEverythingNewsModel
import com.dd.domain.model.news.DomainResponseTopHeadlinesNewsModel

fun DataResponseTopHeadlinesNewsApi.toDomainModel(): DomainResponseTopHeadlinesNewsModel =
    DomainResponseTopHeadlinesNewsModel(
        status = status,
        totalResults = totalResults,
        articles = articles.map { it.toDomainModel() }
    )


fun DataResponseTopHeadlinesNewsApi.Article.toDomainModel(): DomainResponseTopHeadlinesNewsModel.Article =
    DomainResponseTopHeadlinesNewsModel.Article(
        source = source.toDomainModel(),
        author = author,
        title = title,
        description = description,
        url = url,
        urlToImage = urlToImage,
        publishedAt = publishedAt,
        content = content
    )

fun DataResponseTopHeadlinesNewsApi.Article.Source.toDomainModel(): DomainResponseTopHeadlinesNewsModel.Article.Source =
    DomainResponseTopHeadlinesNewsModel.Article.Source(
        id = id,
        name = name
    )


fun DataResponseEverythingNewsApi.toDomainModel(): DomainResponseEverythingNewsModel =
    DomainResponseEverythingNewsModel(
        status = status,
        totalResults = totalResults,
        articles = articles.map { it.toDomainModel() }
    )

fun DataResponseEverythingNewsApi.Article.toDomainModel(): DomainResponseEverythingNewsModel.Article =
    DomainResponseEverythingNewsModel.Article(
        source = source.toDomainModel(),
        author = author,
        title = title,
        description = description,
        url = url,
        urlToImage = urlToImage,
        publishedAt = publishedAt,
        content = content

    )

fun DataResponseEverythingNewsApi.Article.Source.toDomainModel(): DomainResponseEverythingNewsModel.Article.Source =
    DomainResponseEverythingNewsModel.Article.Source(
        id = id,
        name = name
    )