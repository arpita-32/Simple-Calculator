package com.example.simplecalculator

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.updatePadding

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Set edge-to-edge display for the root view
        val answerView = findViewById<View>(R.id.answer)
        answerView?.let { view ->
            ViewCompat.setOnApplyWindowInsetsListener(view) { v, insets ->
                val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                v.updatePadding(
                    top = systemBars.top,
                    bottom = systemBars.bottom,
                    left = systemBars.left,
                    right = systemBars.right
                )
                insets
            }
        }
    }
}
