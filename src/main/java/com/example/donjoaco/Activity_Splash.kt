package com.example.donjoaco

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.content.Intent

class Activity_Splash : AppCompatActivity() {

    private val tiempoDeEspera: Long = 4000 // 3000 milisegundos = 3 segundos

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, tiempoDeEspera)
    }
}