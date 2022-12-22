package com.example.smkn17jakartaapp
//2112500786
//Aferil Yudhatama
//Moprog-AA

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SiswaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_siswa)

        val nis = findViewById<TextView>(R.id.nis)
        val btnMenu = findViewById<Button>(R.id.btnMenu)

        val nisORnip = intent.getStringExtra("NIS/NIP")
        nis.setText("NIS = $nisORnip")

        btnMenu.setOnClickListener {
            Intent(this, MainActivity2::class.java).also {
                it.putExtra("NIS/NIP",nisORnip)
                startActivity(it)
            }
        }
    }
}