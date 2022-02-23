package com.dd.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.dd.data.db.dao.MoviesDao
import com.dd.data.db.dao.NewsDao
import com.dd.data.db.entities.MovieEntity
import com.dd.data.db.entities.NewsEntity

@Database(
    entities = [MovieEntity::class, NewsEntity::class],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun moviesDao(): MoviesDao
    abstract fun newsDao(): NewsDao
}