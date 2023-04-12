package com.example.latihan3

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class TargetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_target)

        val tvhasil = findViewById<TextView>(R.id.tvhasil)
        val nama = intent.getStringExtra("Extra_Nama")
        val usia = intent.getStringExtra("Extra_Usia")
        val asal = intent.getStringExtra("Extra_Asal")

        val hasilData = "Nama anda adalah   $nama \n" +
                        "Usia anda                  $usia \n" +
                        "Asal                            $asal \n"
        tvhasil.text = hasilData


    }
}