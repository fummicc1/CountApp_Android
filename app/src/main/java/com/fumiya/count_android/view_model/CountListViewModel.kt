package com.fumiya.count_android.view_model

import android.app.Application
import android.view.View
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.fumiya.count_android.data.Count
import com.fumiya.count_android.data.Response


class CountListViewModel: ViewModel() {

    val countList: LiveData<Response<List<Count>>> = MutableLiveData<Response<List<Count>>>()

}