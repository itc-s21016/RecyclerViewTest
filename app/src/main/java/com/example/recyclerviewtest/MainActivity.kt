package com.example.recyclerviewtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewtest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val animalList = listOf<Animal>(
            Animal(R.drawable.cat, "ネコ"),
            Animal(R.drawable.dog, "イヌ"),
            Animal(R.drawable.gorilla, "ゴリラ"),
            Animal(R.drawable.horse, "ウマ"),
            Animal(R.drawable.lion, "ライオン"),
            Animal(R.drawable.logo,"そつけん")
        )

        binding.recyclerView.adapter = CustomAdapter(animalList)
        binding.recyclerView.layoutManager = GridLayoutManager(this, 2, RecyclerView.VERTICAL, false)
    }
}