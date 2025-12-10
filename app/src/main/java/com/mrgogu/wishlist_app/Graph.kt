package com.mrgogu.wishlist_app

import android.content.Context
import androidx.room.Room
import com.mrgogu.wishlist_app.data.WishDatabase
import com.mrgogu.wishlist_app.data.WishRepository

object Graph {
    lateinit var database: WishDatabase

    val wishRepository by lazy {
        WishRepository(wishDao = database.wishDao())
    }

    fun provide(context: Context){
        database= Room.databaseBuilder(context, WishDatabase::class.java, "wishlist.db").build()
    }
}