package com.dd.data.net.model

import com.dd.data.DOUBLE_ZERO
import com.dd.data.INT_ZERO
import com.dd.data.STRING_EMPTY
import com.google.gson.annotations.SerializedName


data class DataResponseLatestMoviesApi(
    @SerializedName("adult")
    val adult: Boolean = false,
    @SerializedName("backdrop_path")
    val backdropPath: Any = Any(),
    @SerializedName("belongs_to_collection")
    val belongsToCollection: Any = Any(),
    @SerializedName("budget")
    val budget: Int = INT_ZERO,
    @SerializedName("genres")
    val genres: List<Any> = listOf(),
    @SerializedName("homepage")
    val homepage: String = STRING_EMPTY,
    @SerializedName("id")
    val id: Int = INT_ZERO,
    @SerializedName("imdb_id")
    val imdbId: Any = Any(),
    @SerializedName("original_language")
    val originalLanguage: String = STRING_EMPTY,
    @SerializedName("original_title")
    val originalTitle: String = STRING_EMPTY,
    @SerializedName("overview")
    val overview: String = STRING_EMPTY,
    @SerializedName("popularity")
    val popularity: Double = DOUBLE_ZERO,
    @SerializedName("poster_path")
    val posterPath: Any = Any(),
    @SerializedName("production_companies")
    val productionCompanies: List<Any> = listOf(),
    @SerializedName("production_countries")
    val productionCountries: List<Any> = listOf(),
    @SerializedName("release_date")
    val releaseDate: String = STRING_EMPTY,
    @SerializedName("revenue")
    val revenue: Int = INT_ZERO,
    @SerializedName("runtime")
    val runtime: Int = INT_ZERO,
    @SerializedName("spoken_languages")
    val spokenLanguages: List<Any> = listOf(),
    @SerializedName("status")
    val status: String = STRING_EMPTY,
    @SerializedName("tagline")
    val tagline: String = STRING_EMPTY,
    @SerializedName("title")
    val title: String = STRING_EMPTY,
    @SerializedName("video")
    val video: Boolean = false,
    @SerializedName("vote_average")
    val voteAverage: Double = DOUBLE_ZERO,
    @SerializedName("vote_count")
    val voteCount: Int = INT_ZERO
)