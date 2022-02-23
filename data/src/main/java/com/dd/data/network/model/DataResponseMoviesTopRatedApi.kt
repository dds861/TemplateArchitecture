package com.dd.data.network.model

import com.dd.data.DOUBLE_ZERO
import com.dd.data.INT_ZERO
import com.dd.data.STRING_EMPTY
import com.google.gson.annotations.SerializedName


data class DataResponseMoviesTopRatedApi(
    @SerializedName("page")
    val page: Int = INT_ZERO,
    @SerializedName("results")
    val results: List<Result> = listOf(),
    @SerializedName("total_pages")
    val totalPages: Int = INT_ZERO,
    @SerializedName("total_results")
    val totalResults: Int = INT_ZERO
) {
    data class Result(
        @SerializedName("adult")
        val adult: Boolean = false,
        @SerializedName("backdrop_path")
        val backdropPath: String = STRING_EMPTY,
        @SerializedName("genre_ids")
        val genreIds: List<Int> = listOf(),
        @SerializedName("id")
        val id: Int = INT_ZERO,
        @SerializedName("original_language")
        val originalLanguage: String = STRING_EMPTY,
        @SerializedName("original_title")
        val originalTitle: String = STRING_EMPTY,
        @SerializedName("overview")
        val overview: String = STRING_EMPTY,
        @SerializedName("popularity")
        val popularity: Double = DOUBLE_ZERO,
        @SerializedName("poster_path")
        val posterPath: String = STRING_EMPTY,
        @SerializedName("release_date")
        val releaseDate: String = STRING_EMPTY,
        @SerializedName("title")
        val title: String = STRING_EMPTY,
        @SerializedName("video")
        val video: Boolean = false,
        @SerializedName("vote_average")
        val voteAverage: Double = DOUBLE_ZERO,
        @SerializedName("vote_count")
        val voteCount: Int = INT_ZERO
    )
}