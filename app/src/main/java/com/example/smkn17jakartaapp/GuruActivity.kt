package com.example.smkn17jakartaapp

//2112500786
//Aferil Yudhatama
//Moprog-AA

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class GuruActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guru)

        val nip = findViewById<TextView>(R.id.nip)
        val btnMenu = findViewById<Button>(R.id.btnMenu)

        val nisORnip = intent.getStringExtra("NIS/NIP")

        btnMenu.setOnClickListener {
            Intent(this, MainActivity2::class.java).also {
                it.putExtra("NIS/NIP",nisORnip)
                startActivity(it)
            }
        }
    }
}