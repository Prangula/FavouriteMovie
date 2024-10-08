package com.example.favouritemovie.ui

import android.annotation.SuppressLint
import android.os.Bundle

import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.example.favouritemovie.R

@SuppressLint("CustomSplashScreen")
class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

    }
}