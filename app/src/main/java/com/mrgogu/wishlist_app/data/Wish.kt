package com.mrgogu.wishlist_app.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wish-table")
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id: Long=0L,
    @ColumnInfo(name= "wish-title")
    val title: String="",
    @ColumnInfo(name= "wish-desc")
    val description: String=""
)
object DummyWishes {
    val wishlist = listOf(
        Wish(title= "Senior Android Dev",
        description = "Learning and Practicing the core concepts and applying in to Projects"),
        Wish(title= "Become Myself",
        description = "Exploring and learning habits and behaviour to get orderly maturity"),
        Wish(title= "Buying an Mercedes Benz",
        description = "Developing Carrier to Buy or do whatever I wish to ")
    )
}