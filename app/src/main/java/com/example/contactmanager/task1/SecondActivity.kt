package com.example.contactmanager.task1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.contactmanager.R
import com.example.contactmanager.utils.logger

class SecondActivity : AppCompatActivity() {
    override fun onStart() {
        super.onStart()
        logger("Task 1", "Second Activity: onStart")
    }

    override fun onResume() {
        super.onResume()
        logger("Task 1", "Second Activity: onResume")
    }

    override fun onStop() {
        super.onStop()
        logger("Task 1", "Second Activity: onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        logger("Task 1", "Second Activity: onDestroy")
    }

    override fun onPause() {
        super.onPause()
        logger("Task 1", "Second Activity: onPause")
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        logger("Task 1", "Second Activity: onCreate")
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)
        val returnButton = findViewById<Button>(R.id.return_btn)
        returnButton.setOnClickListener {
            finish()
        }
    }
}