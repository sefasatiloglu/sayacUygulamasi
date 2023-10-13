package com.example.sayacuygulamasi

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var textViewSayac:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textViewSayac = findViewById(R.id.textViewSayac)

        val sp = getSharedPreferences("Sayac", Context.MODE_PRIVATE)
        var sayac = sp.getInt("sayac",0)

        val editor = sp.edit()
        editor.putInt("sayac",++sayac) // sayaci bir birer artir.
        editor.commit() // kayit islemi gerceklesir.


        textViewSayac.text = "Program $sayac kere calistirildi."



    }
}