package com.dd.data.network.model
import com.dd.data.INT_ZERO
import com.dd.data.STRING_EMPTY
import com.google.gson.annotations.SerializedName


data class DataResponseEverythingNewsApi(
    @SerializedName("status")
    val status: String = STRING_EMPTY,
    @SerializedName("totalResults")
    val totalResults: Int = INT_ZERO,
    @SerializedName("articles")
    val articles: List<Article> = listOf()
) {
    data class Article(
        @SerializedName("source")
        val source: Source = Source(),
        @SerializedName("author")
        val author: String = STRING_EMPTY,
        @SerializedName("title")
        val title: String = STRING_EMPTY,
        @SerializedName("description")
        val description: String = STRING_EMPTY,
        @SerializedName("url")
        val url: String = STRING_EMPTY,
        @SerializedName("urlToImage")
        val urlToImage: String = STRING_EMPTY,
        @SerializedName("publishedAt")
        val publishedAt: String = STRING_EMPTY,
        @SerializedName("content")
        val content: String = STRING_EMPTY
    ) {
        data class Source(
            @SerializedName("id")
            val id: String = STRING_EMPTY,
            @SerializedName("name")
            val name: String = STRING_EMPTY
        )
    }
}