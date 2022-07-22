package com.keshav.foodrunner

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SignupActivity : AppCompatActivity() {
    lateinit var etRegistraterName: EditText
    lateinit var etEmail: EditText
    lateinit var etMobileNumber:EditText
    lateinit var etDelivery:EditText
    lateinit var etRegisterPassword:EditText
    lateinit var etMatchPassword:EditText
    lateinit var btnRegister: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        etRegistraterName=findViewById(R.id.etRegisterName)
        etEmail=findViewById(R.id.etEmail)
        etMobileNumber=findViewById(R.id.etMobileNumber)
        etDelivery=findViewById(R.id.etDelivery)
        etRegisterPassword=findViewById(R.id.etRegisterPassword)
        etMatchPassword=findViewById(R.id.etMatchPassword)
        btnRegister=findViewById(R.id.btnRegister)

    btnRegister.setOnClickListener {
        val registrationName=etRegistraterName.text.toString()
        val registrationEmailAddress=etEmail.text.toString()
        val registrationMobileNumber=etMobileNumber.text.toString()
        val registrationAddress=etDelivery.text.toString()
        val registrationPassword=etRegisterPassword.text.toString()
        val registrationConfirmPassword=etMatchPassword.text.toString()
        val fieldsFilled=registrationName.isNotEmpty() &&
                registrationEmailAddress.isNotEmpty() &&
                registrationMobileNumber.isNotEmpty() &&
                registrationAddress.isNotEmpty()&&
                registrationPassword.isNotEmpty()&&
                registrationConfirmPassword==registrationPassword
        val passwordsMatch=registrationPassword==registrationConfirmPassword


        if(fieldsFilled){
            val intent= Intent(this@SignupActivity,SignupCredActivity::class.java)
            intent.putExtra("Registration Name",registrationName)
            intent.putExtra("Registration Email Address",registrationEmailAddress)
            intent.putExtra("Registration Mobile",registrationMobileNumber)
            intent.putExtra("Registration Address",registrationAddress)
            intent.putExtra("Registration Password",registrationPassword)
            startActivity(intent)
        }

        else if(!fieldsFilled){
            if(passwordsMatch){
                Toast.makeText(this@SignupActivity,"Please enter all credentials",Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this@SignupActivity,"Please enter all credentials properly",Toast.LENGTH_SHORT).show()
            }
        }
    }
}

    override fun onRestart() {
        super.onRestart()
        val intent2=Intent(this@SignupActivity,LoginActivity::class.java)
        startActivity(intent2)
    }
}