package com.usiel.proyecto_4


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {

    private val SPLASH_TIME_OUT: Long = 3000 // 3 segundos

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Temporizador para el splash screen
        Handler().postDelayed({
            // Esta función se ejecuta después del temporizador
            // Puedes iniciar la actividad principal o cualquier otra actividad aquí
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

            // Cierra esta actividad
            finish()
        }, SPLASH_TIME_OUT)
    }
}