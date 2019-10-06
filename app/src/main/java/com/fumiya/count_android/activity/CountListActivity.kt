package com.fumiya.count_android.activity

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.fumiya.count_android.R
import kotlinx.android.synthetic.main.activity_count_list.*
import kotlinx.android.synthetic.main.activity_main.view.*

class CountListActivity : ScopedAppActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_count_list)
        val recyclerView = recyclerView
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        class myViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
            val titleTextView = itemView.titleTextView
            val countTextView = itemView.countTextView
        }

        recyclerView.adapter = object: RecyclerView.Adapter<myViewHolder>() {
            override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
                val itemView = LayoutInflater.from(parent.context).inflate(R.layout.count_list_item_view, parent, false)
                return myViewHolder(itemView)
            }

            override fun onBindViewHolder(holder: myViewHolder, position: Int) {
                holder.titleTextView.setText(position.toString())
            }

            override fun getItemCount(): Int {
                return 3
            }
        }
    }
}
