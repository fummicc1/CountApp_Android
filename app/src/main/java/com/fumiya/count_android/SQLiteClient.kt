package com.fumiya.count_android

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.os.Build

class SQLiteClient(context: Context): SQLiteOpenHelper(context, DBName, null, VERSION) {

    // データベース作成時に呼ばれる。
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL("CREATE TABLE COUNT_TABLE (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "title TEXT, " +
                "amount INTEGER, " +
                "date INTEGER)")
    }

    // データベースをバージョンアップしたときに呼ばれる。
    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {

    }

    // データーベースが開かれたときに呼ばれる。
    override fun onOpen(db: SQLiteDatabase?) {
        super.onOpen(db)
    }

    // staticはKotlinでは使用できない。
    companion object {
        // データベースの名前
        private val DBName = "CountAppDatabase"
        // データベースのバージョン(2,3と挙げていくとonUpgradeメソッドが実行される)
        private val VERSION = 1

        fun create() {
            val values = ContentValues()
        }

        fun update() {

        }

        fun delete() {
        }

        fun read() {

        }
    }

}