package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val greetingTextView = findViewById<TextView>(R.id.tvHello)
        val inputField = findViewById<EditText>(R.id.tvName)
        val submitButton = findViewById<Button>(R.id.btnSubmit)
        submitButton.setOnClickListener{
            val enteredName = inputField.text.toString()
            if(enteredName==""){
                greetingTextView.text=""
                Toast.makeText(this@MainActivity,"Please Enter Your Name", Toast.LENGTH_SHORT).show()
            }
            else {
                val message = "Welcome $enteredName"
                greetingTextView.text = message
                inputField.text.clear()
            }
        }
    }
}