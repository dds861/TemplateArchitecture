package com.dd.data.db

import androidx.paging.PagingSource
import androidx.room.*
import androidx.sqlite.db.SupportSQLiteQuery
import com.dd.data.db.entities.MovieEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface MoviesDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(entity: MovieEntity)

    @RawQuery(observedEntities = [MovieEntity::class])
    fun getByQuery(query: SupportSQLiteQuery): PagingSource<Int, MovieEntity>

    @Query("SELECT * FROM ${MovieEntity.TABLE_NAME}")
    fun getByPage(): PagingSource<Int, MovieEntity>

    @Query("SELECT * FROM ${MovieEntity.TABLE_NAME}")
    fun get(): Flow<List<MovieEntity>>

    @Query("DELETE FROM ${MovieEntity.TABLE_NAME}")
    suspend fun delete()

}