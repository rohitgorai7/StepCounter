package com.example.stepcounter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText


class Main2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var start = findViewById<Button>(R.id.start_count)
        var userTarget = findViewById<EditText>(R.id.user_t)
        var userName = findViewById<EditText>(R.id.user_n)

        start.setOnClickListener {
            val intent = Intent(this@Main2Activity, PageActivity::class.java)
            val target = userTarget.text.toString()
            val name = userName.text.toString()
            intent.putExtra("target", target)
            intent.putExtra("name", name)
            startActivity(intent)
        }

    }
}