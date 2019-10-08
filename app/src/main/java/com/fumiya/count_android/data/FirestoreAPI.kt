package com.fumiya.count_android.data

import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.FirebaseFirestoreException
import com.google.firebase.firestore.Query
import kotlinx.coroutines.tasks.await

object  FirestoreAPI {
    private val firestore = FirebaseFirestore.getInstance()
}