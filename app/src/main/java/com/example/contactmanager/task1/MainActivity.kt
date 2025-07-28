package com.example.contactmanager.task1

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.contactmanager.R
import com.example.contactmanager.utils.logger

class MainActivity : AppCompatActivity() {
    override fun onStart() {
        super.onStart()
        logger("Task 1", "Main Activity: onStart")
    }

    override fun onResume() {
        super.onResume()
        logger("Task 1", "Main Activity: onResume")
    }

    override fun onStop() {
        super.onStop()
        logger("Task 1", "Main Activity: onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        logger("Task 1", "Main Activity: onDestroy")
    }

    override fun onPause() {
        super.onPause()
        logger("Task 1", "Main Activity: onPause")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        logger("Task 1", "Main Activity: onCreate")
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val nextPageButton = findViewById<Button>(R.id.next_page_btn)
        nextPageButton.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
        val shareButton = findViewById<Button>(R.id.share_btn)
        val shareEV = findViewById<EditText>(R.id.message_ev)
        shareButton.setOnClickListener {
            if (shareEV.text.isNullOrBlank()) {
                Toast.makeText(baseContext, "Can't send an empty message", Toast.LENGTH_SHORT)
                    .show()
                return@setOnClickListener
            }
            val intent = Intent(Intent.ACTION_SEND).apply {
                putExtra(Intent.EXTRA_TEXT, shareEV.text)
                type = "text/plain"
            }
            startActivity(Intent.createChooser(intent, "Share using...."))
        }
    }
}