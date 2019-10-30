package com.fumiya.count_android.activity

import android.os.Bundle
import android.os.PersistableBundle
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.fumiya.count_android.R
import com.fumiya.count_android.data.Count
import com.fumiya.count_android.data.FirestoreAPI
import com.fumiya.count_android.view_model.CountListViewModel
import kotlinx.android.synthetic.main.activity_count_list.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.coroutines.launch

class CountListActivity : ScopedAppActivity() {

    lateinit var viewModel: CountListViewModel

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        viewModel = ViewModelProviders.of(this).get(CountListViewModel::class.java)


    }

    private val updateCountList = Observer<List<Count>> { value ->

    }

}