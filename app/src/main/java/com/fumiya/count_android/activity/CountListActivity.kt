package com.fumiya.count_android.activity

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.fumiya.count_android.R
import com.fumiya.count_android.data.FirestoreAPI
import kotlinx.android.synthetic.main.activity_count_list.*
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.coroutines.launch

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

        launch {
            val countList =  FirestoreAPI.get("count")

            recyclerView.adapter = object: RecyclerView.Adapter<myViewHolder>() {

                override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
                    val itemView = LayoutInflater.from(parent.context).inflate(R.layout.count_list_item_view, parent, false)
                    return myViewHolder(itemView)
                }

                override fun onBindViewHolder(holder: myViewHolder, position: Int) {
                    holder.titleTextView.setText(countList[position].title)
                    holder.countTextView.setText(countList[position].amount.toString())
                }

                override fun getItemCount(): Int {
                    return countList.count()
                }
            }
        }
    }
}
