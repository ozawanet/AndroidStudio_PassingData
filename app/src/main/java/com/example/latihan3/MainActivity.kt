package com.example.latihan3

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnsubmit = findViewById<Button>(R.id.btnsubmit)
        val edNama = findViewById<EditText>(R.id.edNama)
        val edUsia = findViewById<EditText>(R.id.edUsia)
        val edAsal = findViewById<EditText>(R.id.edAsal)

        btnsubmit.setOnClickListener(){
            val nama = edNama.text.toString()
            val usia = edUsia.text.toString()
            val asal = edAsal.text.toString()

            Intent(this, TargetActivity::class.java).also {
                it.putExtra("Extra_Nama",nama)
                it.putExtra("Extra_Usia",usia)
                it.putExtra("Extra_Asal",asal)
                startActivity(it)
            }
        }

        val btnbundle = findViewById<Button>(R.id.btnbundel)


        btnbundle.setOnClickListener(){
            val nama = edNama.text.toString()
            val usia = edUsia.text.toString()
            val asal = edAsal.text.toString()

            val bundle = Bundle()
            bundle.putString("Bundle_Nama", nama)
            bundle.putString("Bundle_Usia", usia)
            bundle.putString("Bundle_Asal", asal)

            val intent = Intent(this, TargetActivity2::class.java)
            intent.putExtras(bundle)
            startActivity(intent)

        }
    }
}