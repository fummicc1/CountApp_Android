package com.fumiya.count_android

import androidx.room.TypeConverter
import java.text.SimpleDateFormat
import java.util.*
import java.util.logging.SimpleFormatter


class DateConverter {

    @TypeConverter
    fun toDate(time: Long): Date {
        return Date(time)
    }

    @TypeConverter
    fun fromDate(date: Date): Long {
        return date.time
    }
}