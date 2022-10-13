package com.example.ageinminutes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private var usr_Name:EditText?= null
    private var usr_Age:EditText?=null
    lateinit var calculate:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        usr_Name = findViewById(R.id.editTextTextPersonName)   //personname
        usr_Age = findViewById(R.id.age)                        //age
        calculate = findViewById(R.id.button2)
        //button
        calculate.setOnClickListener {
            var _usrName = usr_Name?.text.toString()
            var _usrAge = usr_Age?.text.toString()
            //365*24*60
            var usr_Age = _usrAge.toInt()
            var calculation = usr_Age*365*24*60
            val intent = Intent(this@MainActivity, CalculatedAge::class.java)
            intent.putExtra("ageInMinutes", calculation.toString())
            intent.putExtra("name", _usrName)
            startActivity(intent)
        }
    }

}


