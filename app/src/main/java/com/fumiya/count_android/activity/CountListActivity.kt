package com.fumiya.count_android.activity

import android.os.Bundle
import android.os.PersistableBundle
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.firebase.ui.firestore.FirestoreRecyclerAdapter
import com.firebase.ui.firestore.FirestoreRecyclerOptions
import com.fumiya.count_android.R
import com.fumiya.count_android.data.Count
import com.fumiya.count_android.data.FirestoreAPI
import kotlinx.android.synthetic.main.activity_count_list.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.coroutines.launch

class CountListActivity : ScopedAppActivity() {
}