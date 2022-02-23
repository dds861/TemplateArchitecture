package com.dd.data.db

import androidx.paging.PagingSource
import androidx.room.*
import androidx.sqlite.db.SupportSQLiteQuery
import com.dd.data.db.entities.NewsEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface NewsDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(entity: NewsEntity)

    @RawQuery(observedEntities = [NewsEntity::class])
    fun getByQuery(query: SupportSQLiteQuery): PagingSource<Int, NewsEntity>

    @Query("SELECT * FROM ${NewsEntity.TABLE_NAME}")
    fun getByPage(): PagingSource<Int, NewsEntity>

    @Query("SELECT * FROM ${NewsEntity.TABLE_NAME}")
    fun get(): Flow<List<NewsEntity>>

    @Query("DELETE FROM ${NewsEntity.TABLE_NAME}")
    suspend fun delete()
}