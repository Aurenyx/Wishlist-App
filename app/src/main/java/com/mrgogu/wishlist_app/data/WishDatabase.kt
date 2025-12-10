package com.mrgogu.wishlist_app.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [Wish :: class],
    version = 1, // its our first database
    exportSchema = false
)
abstract class WishDatabase : RoomDatabase() {
    abstract fun wishDao() : WishDao
}