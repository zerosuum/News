package com.example.news

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class NewsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)

        findViewById<TextView>(R.id.txt_toolbar_title).text = getString(R.string.menu_news)

        findViewById<Button>(R.id.btnPrev).setOnClickListener {
            Toast.makeText(this, "Sebelumnya: (belum ada artikel lain)", Toast.LENGTH_SHORT).show()
        }
        findViewById<Button>(R.id.btnNext).setOnClickListener {
            Toast.makeText(this, "Selanjutnya: (belum ada artikel lain)", Toast.LENGTH_SHORT).show()
        }
    }
}
