package com.dd.data.utils

import com.dd.data.net.model.news.DataResponseTopHeadlinesNewsModel
import com.dd.domain.model.news.DomainResponseTopHeadlinesNewsModel

fun DataResponseTopHeadlinesNewsModel.toDomainModel(): DomainResponseTopHeadlinesNewsModel =
    DomainResponseTopHeadlinesNewsModel(
        status = status,
        totalResults = totalResults,
        articles = articles.map { it.toDomainModel() }
    )

fun DataResponseTopHeadlinesNewsModel.Article.toDomainModel(): DomainResponseTopHeadlinesNewsModel.Article =
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

fun DataResponseTopHeadlinesNewsModel.Article.Source.toDomainModel(): DomainResponseTopHeadlinesNewsModel.Article.Source =
    DomainResponseTopHeadlinesNewsModel.Article.Source(
        id = id,
        name = name
    )