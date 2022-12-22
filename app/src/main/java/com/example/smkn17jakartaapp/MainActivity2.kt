package com.example.smkn17jakartaapp
//2112500786
//Aferil Yudhatama
//Moprog-AA

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val SelamatDatang = findViewById<TextView>(R.id.SelamatDatang)
        val btnSiswa = findViewById<Button>(R.id.btnSiswa)
        val btnGuru = findViewById<Button>(R.id.btnGuru)
        val btnMapel = findViewById<Button>(R.id.btnMapel)

        val nisORnip = intent.getStringExtra("NIS/NIP")
        SelamatDatang.setText("Selamat Datang $nisORnip")

        btnSiswa.setOnClickListener {
            Intent(this, SiswaActivity::class.java).also {
                it.putExtra("NIS/NIP",nisORnip)
                startActivity(it)
            }
        }
        btnGuru.setOnClickListener {
            Intent(this, GuruActivity::class.java).also {
                it.putExtra("NIS/NIP",nisORnip)
                startActivity(it)
            }
        }
        btnMapel.setOnClickListener {
            Intent(this, MatpelActivity::class.java).also {
                it.putExtra("NIS/NIP",nisORnip)
                startActivity(it)
            }
        }


    }
}
