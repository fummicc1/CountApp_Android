package com.fumiya.count_android.data

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

object AuthAPI {
    private val auth = FirebaseAuth.getInstance()
    val currentUser: FirebaseUser?
        get() = auth.currentUser

    fun createUser(email: String, password: String) {
        auth.createUserWithEmailAndPassword(email, password)
            .addOnSuccessListener { result ->

            }
    }
}