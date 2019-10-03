package com.fumiya.count_android

import android.icu.text.CaseMap
import android.provider.BaseColumns
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
class Count {
    @PrimaryKey(autoGenerate = true)
    val id: Int

    var title: String
    var amount: Int
    var date: Date

    constructor(id: Int = 0, title: String = "", amount: Int = 0, date: Date = Date()) {
        this.id = id
        this.amount = amount
        this.date = date
        this.title = title
    }
}

