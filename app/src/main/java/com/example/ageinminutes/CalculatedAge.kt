package com.example.ageinminutes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class CalculatedAge : AppCompatActivity() {
    private var usr_Name: TextView?= null
    private var usr_Age: TextView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculated_age)
        //usr_Name which view it will point to
        usr_Name = findViewById(R.id.tv_name)
        usr_Age  = findViewById(R.id.tv_age)
        var name_String = intent.getStringExtra("name")
        usr_Name?.text = "Hey! ${name_String}"
        var age_String = intent.getStringExtra("ageInMinutes")
        usr_Age?.text = "You Lived ${age_String} Minutes"




    }
}