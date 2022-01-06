package com.example.triviaapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.triviaapp.adapter.ItemAdapter
import com.example.triviaapp.data.PlayerDataSource
import com.example.triviaapp.databinding.ConsultRegisterActivityBinding

class ConsultRegisterActivity : AppCompatActivity() {

    lateinit var binding: ConsultRegisterActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ConsultRegisterActivityBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val myDataset = PlayerDataSource.getPlayerList()

        val recyclerView = findViewById<RecyclerView>(R.id.list)
        recyclerView.adapter = ItemAdapter(this, myDataset)

        recyclerView.setHasFixedSize(true)

        binding.buttonReturn.setOnClickListener {
            onBackPressed()
        }
    }
}