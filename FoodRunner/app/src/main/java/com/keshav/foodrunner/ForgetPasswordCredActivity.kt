package com.keshav.foodrunner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ForgetPasswordCredActivity : AppCompatActivity() {
    lateinit var txtMobileNumber : TextView
    lateinit var txtEmail : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forget_password_cred)
        val number = intent.getStringExtra("number")
        val mail = intent.getStringExtra("Email")
        txtMobileNumber = findViewById(R.id.txtMobileNumber)
        txtEmail = findViewById(R.id.txtEmail)
        txtMobileNumber.text =number
        txtEmail.text = mail
    }
}