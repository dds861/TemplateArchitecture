package com.dd.domain.model.news

import com.dd.domain.INT_ZERO
import com.dd.domain.STRING_EMPTY


data class DomainResponseNewsEverythingModel(

    val status: String = STRING_EMPTY,
    val totalResults: Int = INT_ZERO,
    val articles: List<Article> = listOf()
) {
    data class Article(
        val source: Source = Source(),
        val author: String = STRING_EMPTY,
        val title: String = STRING_EMPTY,
        val description: String = STRING_EMPTY,
        val url: String = STRING_EMPTY,
        val urlToImage: String = STRING_EMPTY,
        val publishedAt: String = STRING_EMPTY,
        val content: String = STRING_EMPTY
    ) {
        data class Source(
            val id: String = STRING_EMPTY,
            val name: String = STRING_EMPTY
        )
    }
}