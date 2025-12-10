package com.mrgogu.wishlist_app.data

import androidx.room.Dao
import androidx.room.Delete

import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
abstract class WishDao {

    //Inserting an wish in database also Ignore is to ignore the conflicts which can cause in data insertion
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    abstract  fun addAWish(wishEntity: Wish)

    //To get all the data or in this case All the wishes from DB
    @Query("Select * from `wish-table`")
    abstract  fun getAllWishes() : Flow<List<Wish>>

    //Update or edit a data in DataBase
    @Update
    abstract  fun updateAWish(wishEntity: Wish)

    //Delete a data from a DB
    @Delete
    abstract  fun deleteAWish(wishEntity: Wish)

    //To get a specific data or Wish from DB by Id
    @Query("Select * from `wish-table` where id=:id")
    abstract  fun getAWishById(id:Long) : Flow<Wish>
}