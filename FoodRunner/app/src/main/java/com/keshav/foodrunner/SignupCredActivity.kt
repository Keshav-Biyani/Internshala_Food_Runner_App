package com.keshav.foodrunner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SignupCredActivity : AppCompatActivity() {

    lateinit var txtName: TextView
    lateinit var txtEmail:TextView
    lateinit var txtMobileNumber:TextView
    lateinit var txtDelivery:TextView
    lateinit var txtPassword:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup_cred)

        txtName=findViewById(R.id.txtName)
        txtEmail=findViewById(R.id.txtEmail)
        txtMobileNumber=findViewById(R.id.txtMobileNumber)
        txtDelivery=findViewById(R.id.txtDelivery)
        txtPassword=findViewById(R.id.txtPassword)

        val registrationName:String=intent.getStringExtra("Registration Name").toString()
        val registrationEmailAddress:String=intent.getStringExtra("Registration Email Address").toString()
        val registrationMobile:String=intent.getStringExtra("Registration Mobile").toString()
        val deliveryAddress:String=intent.getStringExtra("Registration Address").toString()
        val registrationPassword:String=intent.getStringExtra("Registration Password").toString()

        txtName.text= registrationName
        txtEmail.text= registrationEmailAddress
        txtMobileNumber.text= registrationMobile
        txtDelivery.text= deliveryAddress
        txtPassword.text= registrationPassword
    }
    }
