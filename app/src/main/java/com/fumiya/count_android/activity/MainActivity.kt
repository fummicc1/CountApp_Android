package com.fumiya.count_android.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fumiya.count_android.R
import com.fumiya.count_android.data.AuthAPI
import com.fumiya.count_android.data.Count
import com.fumiya.count_android.data.FirestoreAPI
import com.fumiya.count_android.data.Status
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.launch
import java.util.*


class MainActivity : ScopedAppActivity() {

    var count: Count = Count(
        senderID = "",
        id = "",
        title = "",
        amount = 0,
        date = Date(),
        saveCount = 0,
        status = Status.privateCount
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        plusButton.setOnClickListener {
            count.amount += 1
            countTextView.text = count.amount.toString()
        }
        minusButton.setOnClickListener {
            count.amount -= 1
            countTextView.text = count.amount.toString()
        }

        saveButton.setOnClickListener {

        }

        listButton.setOnClickListener {
            val intent = Intent(this, CountListActivity::class.java)
            startActivity(intent)
        }
    }
}