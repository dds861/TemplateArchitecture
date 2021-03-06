package com.dd.data.db.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = MovieEntity.TABLE_NAME)
data class MovieEntity(
    @ColumnInfo(name = ADULT) val adult: Boolean?,
    @ColumnInfo(name = BACKDROP_PATH) val backdropPath: String?,
//    @ColumnInfo(name = GENRE_IDS) val genreIds: List<Int> = listOf(),
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = ID) val id: Int?,
    @ColumnInfo(name = ORIGINAL_LANGUAGE) val originalLanguage: String?,
    @ColumnInfo(name = ORIGINAL_TITLE) val originalTitle: String?,
    @ColumnInfo(name = OVERVIEW) val overview: String?,
    @ColumnInfo(name = POPULARITY) val popularity: Double?,
    @ColumnInfo(name = POSTER_PATH) val posterPath: String?,
    @ColumnInfo(name = RELEASE_DATE) val releaseDate: String?,
    @ColumnInfo(name = TITLE) val title: String?,
    @ColumnInfo(name = VIDEO) val video: Boolean?,
    @ColumnInfo(name = VOTE_AVERAGE) val voteAverage: Double?,
    @ColumnInfo(name = VOTE_COUNT) val voteCount: Int?
) {
    companion object {
        const val TABLE_NAME = "movies_table"
        const val ADULT = "adult"
        const val BACKDROP_PATH = "backdrop_path"
        const val GENRE_IDS = "genre_ids"
        const val ID = "id"
        const val ORIGINAL_LANGUAGE = "original_language"
        const val ORIGINAL_TITLE = "original_title"
        const val OVERVIEW = "overview"
        const val POPULARITY = "popularity"
        const val POSTER_PATH = "poster_path"
        const val RELEASE_DATE = "release_date"
        const val TITLE = "title"
        const val VIDEO = "video"
        const val VOTE_AVERAGE = "vote_average"
        const val VOTE_COUNT = "vote_count"
    }
}