package com.fumiya.count_android.data

import com.google.firebase.firestore.FirebaseFirestore

object  FirestoreAPI {
    private val firestore = FirebaseFirestore.getInstance()

    fun listen(collectionName: String) {
        firestore.collection(collectionName).get().addOnSuccessListener { result ->
            var countList: Array<Count> = emptyArray()
            for (document in result.documents) {
                document.toObject(Count::class.java)?.let { count ->
                    countList.plus(count)
                }
            }

        }
    }
}