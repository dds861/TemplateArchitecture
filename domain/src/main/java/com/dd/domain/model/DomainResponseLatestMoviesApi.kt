package com.dd.domain.model

import com.dd.domain.DOUBLE_ZERO
import com.dd.domain.INT_ZERO
import com.dd.domain.STRING_EMPTY


data class DomainResponseLatestMoviesApi(
        val adult: Boolean = false,
        val backdropPath: Any = Any(),
        val belongsToCollection: Any = Any(),
        val budget: Int = INT_ZERO,
        val genres: List<Any> = listOf(),
        val homepage: String = STRING_EMPTY,
        val id: Int = INT_ZERO,
        val imdbId: Any = Any(),
        val originalLanguage: String = STRING_EMPTY,
        val originalTitle: String = STRING_EMPTY,
        val overview: String = STRING_EMPTY,
        val popularity: Double = DOUBLE_ZERO,
        val posterPath: Any = Any(),
        val productionCompanies: List<Any> = listOf(),
        val productionCountries: List<Any> = listOf(),
        val releaseDate: String = STRING_EMPTY,
        val revenue: Int = INT_ZERO,
        val runtime: Int = INT_ZERO,
        val spokenLanguages: List<Any> = listOf(),
        val status: String = STRING_EMPTY,
        val tagline: String = STRING_EMPTY,
        val title: String = STRING_EMPTY,
        val video: Boolean = false,
        val voteAverage: Double = DOUBLE_ZERO,
        val voteCount: Int = INT_ZERO
)