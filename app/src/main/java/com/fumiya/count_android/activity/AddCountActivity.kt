package com.fumiya.count_android.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fumiya.count_android.R
import com.fumiya.count_android.data.AuthAPI
import com.fumiya.count_android.data.Count
import com.fumiya.count_android.data.FirestoreAPI
import com.fumiya.count_android.data.Status
import com.fumiya.count_android.view_model.AddCountViewModel
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.launch
import java.util.*


class AddCountActivity : ScopedAppActivity() {

    lateinit var viewModel: AddCountViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = AddCountViewModel()

        plusButton.setOnClickListener {
        }
        minusButton.setOnClickListener {
        }

        saveButton.setOnClickListener {

        }

        listButton.setOnClickListener {
            val intent = Intent(this, CountListActivity::class.java)
            startActivity(intent)
        }
    }
}