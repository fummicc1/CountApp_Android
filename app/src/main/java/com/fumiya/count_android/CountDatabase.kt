package com.fumiya.count_android

import android.content.Context
import androidx.room.*

@Database(entities = [Count::class], version = 1)
@TypeConverters(DateConverter::class)
abstract class CountDatabase: RoomDatabase() {

    abstract fun countDAO(): CountDAOInterface

    companion object {
        private var INSTANCE: CountDatabase? = null

        fun instance(context: Context): CountDatabase {
            if (INSTANCE == null) {
                synchronized(CountDatabase::class) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(), CountDatabase::class.java, "CountDatabase.java").build()
                }
            }
            return INSTANCE!!
        }

        fun destroy() {
            INSTANCE = null
        }
    }
}