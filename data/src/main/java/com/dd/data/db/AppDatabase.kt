package com.dd.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.dd.data.db.entities.MovieEntity
import com.dd.data.db.entities.NewsEntity

@Database(
    entities = [MovieEntity::class, NewsEntity::class],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun templateDao(): MoviesDao
}