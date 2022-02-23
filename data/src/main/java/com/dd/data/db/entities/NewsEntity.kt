package com.dd.data.db.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = NewsEntity.TABLE_NAME)
data class NewsEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = ID) val id: Int?,
    @ColumnInfo(name = NAME) val name: String?
) {
    companion object {
        const val TABLE_NAME = "news_table"
        const val ID = "id"
        const val NAME = "name"
    }
}