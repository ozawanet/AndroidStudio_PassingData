package com.example.latihan3

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class TargetActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_target2)

        val tvhasil = findViewById<TextView>(R.id.tvhasil)
        val bundle = intent.extras
        val nama = bundle?.getString("Bundle_Nama")
        val usia = bundle?.getString("Bundle_Usia")
        val asal = bundle?.getString("Bundle_Asal")

        val hasilData = "Nama anda adalah   $nama \n" +
                "Usia anda                  $usia \n" +
                "Asal                            $asal \n"
        tvhasil.text = hasilData
    }
}