package com.example.logingoogle_facebook

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvLoginGoogle : TextView = findViewById(R.id.tvLoginGoogle)
        tvLoginGoogle.setOnClickListener {
            startActivity(Intent(this,LoginGoogleAct::class.java))
        }

        val tvLoginFacebook : TextView = findViewById(R.id.tvLoginFb)
        tvLoginFacebook.setOnClickListener {
            startActivity(Intent(this,LoginFacebookAct::class.java))
        }


    }




}