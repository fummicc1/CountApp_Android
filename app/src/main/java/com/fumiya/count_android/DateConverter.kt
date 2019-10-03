package com.fumiya.count_android

import java.text.SimpleDateFormat
import java.util.*
import java.util.logging.SimpleFormatter

object DateConverter {
    // この返り値をデータベースに保存する。（Date型を直接保存はできない。）
    fun getCurrentDate(): Long {
        return  System.currentTimeMillis()
    }

    // 日付（Date）を文字列に変換する。
    fun convertLongToString(date: Date): String {
        val simpleDateFormat = SimpleDateFormat("yyyy/MM/dd HH:mm:ss")
        return simpleDateFormat.format(date)
    }
}