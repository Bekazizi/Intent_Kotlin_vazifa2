package com.example.intent_kotlin_vazifa2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.intent_kotlin_vazifa2.user.User

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }
    fun initViews(){
        var b_detail = findViewById<Button>(R.id.b_detail);
        b_detail.setOnClickListener {
            var user = User(name = "Azizbek", age = 20)
            openDetailActivity(user)
        }
    }

    fun openDetailActivity(user: User){
        var intent = Intent(this, DetailActivity::class.java);
        intent.putExtra("user",user)

        startActivity(intent)

    }
}