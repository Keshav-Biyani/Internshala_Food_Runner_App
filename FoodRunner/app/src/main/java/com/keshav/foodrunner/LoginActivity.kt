package com.keshav.foodrunner

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    lateinit var etMobileNumber : EditText
    lateinit var etPassword : EditText
    lateinit var btnLogin : Button
    lateinit var txtRegister : TextView
    lateinit var txtForget : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        etMobileNumber = findViewById(R.id.etMobileNumber)
        etPassword = findViewById(R.id.etPassword)
        btnLogin = findViewById(R.id.btnLogin)
        txtForget = findViewById(R.id.txtForget)
        txtRegister = findViewById(R.id.txtRegister)
        btnLogin.setOnClickListener {
            val number = etMobileNumber.text.toString()
            val password = etPassword.text.toString()
            val intent = Intent(this@LoginActivity,LoginCredActivity::class.java)
            intent.putExtra("Number",number)
            intent.putExtra("password",password)
            startActivity(intent)
        }
        txtForget.setOnClickListener{
            val intent = Intent(this@LoginActivity,ForgetPasswordActivity::class.java)
            startActivity(intent)
        }
        txtRegister.setOnClickListener{
            val intent = Intent(this@LoginActivity,SignupActivity::class.java)
            startActivity(intent)
        }



    }
}