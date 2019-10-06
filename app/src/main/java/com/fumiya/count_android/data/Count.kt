package com.fumiya.count_android.data

import android.icu.text.CaseMap
import android.provider.BaseColumns
import java.util.*

data class Count(
    var senderID: String,
    var id: String,
    var title: String,
    var amount: Int,
    var date: Date,
    var saveCount: Int,
    var status: Status
) {
    var isMine = true
}

