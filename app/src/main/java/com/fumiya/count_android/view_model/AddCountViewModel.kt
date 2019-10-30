package com.fumiya.count_android.view_model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.fumiya.count_android.data.Count
import com.fumiya.count_android.data.Status
import java.util.*

class AddCountViewModel : ViewModel() {

    val count: MutableLiveData<Count> = MutableLiveData()

    init {
        count.value = Count(senderID = "", id = "", title = "", amount = 0, date = Date(), saveCount = 0, status = Status.privateCount, isMine = false)
    }

}