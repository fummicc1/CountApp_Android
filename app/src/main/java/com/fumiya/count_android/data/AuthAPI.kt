package com.fumiya.count_android.data

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseAuthException
import com.google.firebase.auth.FirebaseUser
import kotlinx.coroutines.tasks.await

object AuthAPI {
    private val auth = FirebaseAuth.getInstance()
    val currentUser: FirebaseUser?
        get() = auth.currentUser

    suspend fun createUser(email: String, password: String): FirebaseUser? {
        val result = auth.createUserWithEmailAndPassword(email, password).await()
        return result.user
    }

    suspend fun signInAnonymously(): FirebaseUser? {
        val result = auth.signInAnonymously().await()
        return result.user
    }
}