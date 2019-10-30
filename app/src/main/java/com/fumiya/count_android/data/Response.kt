package com.fumiya.count_android.data

data class Response<T>(
    var value: T?,
    var error: ResponseError?
)