package com.example.smkn17jakartaapp
//2112500786
//Aferil Yudhatama
//Moprog-AA

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nisORnip = findViewById<EditText>(R.id.nisORnip)
        val password = findViewById<EditText>(R.id.password)
        val btnLogin = findViewById<Button>(R.id.btnLogin)

        btnLogin.setOnClickListener {
            //input NIS/NIP
            val nisORnip = nisORnip.text.toString()
            //input Password
            val password = password.text.toString()

            Intent(this, MainActivity2::class.java).also {
                it.putExtra("NIS/NIP",nisORnip)
                it.putExtra("Password",password)
                startActivity(it)
            }
        }
    }
}