package com.fumiya.count_android.data

import android.util.Log
import com.google.firebase.firestore.*
import kotlinx.coroutines.tasks.await

object  FirestoreAPI {
    private val firestore = FirebaseFirestore.getInstance()

    fun create(ref: DocumentReference, data: Count) {
        ref.set(data).addOnCompleteListener { task ->
            if (task.isSuccessful) {
                print("Update Count Data is Successful.")
            }
        }
    }

    fun delete(ref: DocumentReference) {
        ref.delete()
    }

    fun update(ref: DocumentReference, field: String, value: Any) {
        ref.update(field, value)
    }

    fun read(ref: DocumentReference) {
        ref.get().addOnCompleteListener { task ->
            task.result?.let { documentSnapshot ->
                  documentSnapshot.toObject(Count::class.java)
            }
        }
    }

    fun listen(document: DocumentReference, listenerRegistration: ListenerRegistration) {


    }

    fun listen(collection: CollectionReference) {

    }
}