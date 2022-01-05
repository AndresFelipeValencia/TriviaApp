package com.example.triviaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.triviaapp.databinding.ActivityMainBinding
import javax.sql.DataSource

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.register.setOnClickListener {
            startActivity(Intent(this, ConsultRegisterActivity::class.java))
        }

        binding.start.setOnClickListener {
            startActivity(Intent(this, QuestionActivity::class.java ))
        }

    }

}