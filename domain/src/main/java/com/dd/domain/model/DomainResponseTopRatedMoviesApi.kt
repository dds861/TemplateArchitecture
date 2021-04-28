package com.dd.domain.model

import com.dd.domain.DOUBLE_ZERO
import com.dd.domain.INT_ZERO
import com.dd.domain.STRING_EMPTY

data class DomainResponseTopRatedMoviesApi(
    val page: Int = INT_ZERO,
    val results: List<Result> = listOf(),
    val totalPages: Int = INT_ZERO,
    val totalResults: Int = INT_ZERO
) {
    data class Result(
        val adult: Boolean = false,
        val backdropPath: String = STRING_EMPTY,
        val genreIds: List<Int> = listOf(),
        val id: Int = INT_ZERO,
        val originalLanguage: String = STRING_EMPTY,
        val originalTitle: String = STRING_EMPTY,
        val overview: String = STRING_EMPTY,
        val popularity: Double = DOUBLE_ZERO,
        val posterPath: String = STRING_EMPTY,
        val releaseDate: String = STRING_EMPTY,
        val title: String = STRING_EMPTY,
        val video: Boolean = false,
        val voteAverage: Double = DOUBLE_ZERO,
        val voteCount: Int = INT_ZERO
    )
}