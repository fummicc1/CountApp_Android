package com.fumiya.count_android

import android.content.SharedPreferences
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface CountDAOInterface {

    @Query("SELECT * FROM Count")
    fun getAll(): List<Count>

    @Insert
    fun insert(entity: Count)

    @Query("DELETE FROM Count")
    fun deleteAll()

}