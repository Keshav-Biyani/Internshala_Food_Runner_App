package com.keshav.foodrunner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class LoginCredActivity : AppCompatActivity() {
    lateinit var txtMobileNumber :TextView
    lateinit var txtPassword : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_cred)
        val Number=intent.getStringExtra("Number")
        val Password = intent.getStringExtra("password")
        txtMobileNumber = findViewById(R.id.txtMobileNumber)
        txtPassword =findViewById(R.id.txtPassword)
        txtMobileNumber.text = Number
        txtPassword.text = Password


    }
}