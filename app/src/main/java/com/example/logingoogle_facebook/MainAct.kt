package com.example.logingoogle_facebook

import android.content.ContentValues.TAG
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.SignInButton
import com.google.android.gms.common.api.ApiException
import com.google.android.gms.tasks.Task


class MainAct : AppCompatActivity() {
    private val rcSignIn: Int = 101
    private var mGoogleSignInClient : GoogleSignInClient? = null
    private lateinit var signInButton : SignInButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvLoginGoogle : TextView = findViewById(R.id.tvLoginGoogle)
        tvLoginGoogle.setOnClickListener {
            startActivity(Intent(this,LoginGoogleAct::class.java))
        }

    }




}