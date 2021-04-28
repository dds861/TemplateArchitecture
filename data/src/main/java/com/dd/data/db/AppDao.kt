package com.dd.data.db

import androidx.paging.PagingSource
import androidx.room.*
import androidx.sqlite.db.SupportSQLiteQuery
import com.dd.data.db.entities.MovieEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface AppDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMovie(movieEntity: MovieEntity)

    @RawQuery(observedEntities = [MovieEntity::class])
    fun getMoviesByQuery(query: SupportSQLiteQuery): PagingSource<Int, MovieEntity>

    @Query("SELECT * FROM MovieEntity.table_name")
    fun getMoviesByPage(): PagingSource<Int, MovieEntity>

    @Query("SELECT * FROM MovieEntity.table_name")
    fun getMovies(): Flow<List<MovieEntity>>

    @Query("DELETE FROM MovieEntity.table_name")
    suspend fun deleteMovies()

}