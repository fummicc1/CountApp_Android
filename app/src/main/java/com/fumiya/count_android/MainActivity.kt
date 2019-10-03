package com.fumiya.count_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {

    var count: Count = Count()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        thread {
            val countList = CountDatabase.instance(applicationContext).countDAO().getAll()
            print("countList")
            print(countList)
        }

        plusButton.setOnClickListener {
            count.amount += 1
            countTextView.text = count.amount.toString()
        }
        minusButton.setOnClickListener {
            count.amount -= 1
            countTextView.text = count.amount.toString()
        }

        saveButton.setOnClickListener {
            thread {
                CountDatabase.instance(it.context).countDAO().insert(count)
            }
        }
    }
}