package com.fumiya.count_android.data

import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.FirebaseFirestoreException
import kotlinx.coroutines.tasks.await

object  FirestoreAPI {
    private val firestore = FirebaseFirestore.getInstance()

    suspend fun get(collectionName: String): List<Count> {
        val snapshots = firestore.collection(collectionName).get().await()
        return snapshots.documents.mapNotNull { document ->
            document.toObject(Count::class.java)
        }
    }

    fun create(collectionName: String, count: Count): Boolean {
        val ref = firestore.collection(collectionName).document()
        val result = ref.set(count).isSuccessful
        return result
    }
}