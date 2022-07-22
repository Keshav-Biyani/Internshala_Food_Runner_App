package com.keshav.foodrunner

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class ForgetPasswordActivity : AppCompatActivity() {
    lateinit var etForgetMobileNumber: EditText
    lateinit var etForgetEmail: EditText
    lateinit var btnNext: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forget_password)
        etForgetMobileNumber = findViewById(R.id.etForgetMobileNumber)
        etForgetEmail = findViewById(R.id.etForgetEmail)
        btnNext = findViewById(R.id.btnNext)
      btnNext.setOnClickListener {
            val number = etForgetMobileNumber.text.toString()
            val mail = etForgetEmail.text.toString()
          val test = number.isNotEmpty() && mail.isNotEmpty()
          if(test) {
              val intent =
                  Intent(this@ForgetPasswordActivity, ForgetPasswordCredActivity::class.java)
              intent.putExtra("number", number)
              intent.putExtra("Email", mail)
              startActivity(intent)
          }else{
              etForgetEmail.text.clear()
              etForgetMobileNumber.text.clear()
              Toast.makeText(this@ForgetPasswordActivity, "Please enter all credential", Toast.LENGTH_SHORT).show()
          }
        }

    }
    override fun onRestart() {
        super.onRestart()
        val intent1=Intent(this@ForgetPasswordActivity,LoginActivity::class.java)
        startActivity(intent1)
    }
}