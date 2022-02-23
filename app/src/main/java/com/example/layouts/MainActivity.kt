package com.example.layouts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        back.setOnClickListener { backend() }
        front.setOnClickListener { frontend() }
    }

    fun backend(){
        val ventana = Intent(this, backend::class.java)
        startActivity(ventana)

    }

    fun frontend(){
        val ventana = Intent(this, frontend::class.java)
        startActivity(ventana)

    }
}