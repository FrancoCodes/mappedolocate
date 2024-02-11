package com.development.mapsanddata

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashScreen : AppCompatActivity() {
    private val SPLASH_DELAY: Long = 3400 // Delay in milliseconds (3.4 seconds)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        // Using a Handler to delay the start of MainActivity
        Handler().postDelayed({
            // Start MainActivity
            val mainIntent = Intent(this@SplashScreen, MainActivity::class.java)
            startActivity(mainIntent)
            // Close SplashScreen
            finish()
        }, SPLASH_DELAY)
    }
}
