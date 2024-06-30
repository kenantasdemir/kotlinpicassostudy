package com.kenant42.kotlinpicassostudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kenant42.kotlinpicassostudy.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonShow.setOnClickListener{
            val url = "http://kasimadalan.pe.hu/filmler/resimler/django.png"
            Picasso.get().load(url)
                .resize(500,800)
                .placeholder(R.drawable.downloading)
                .error(R.drawable.close)
                .rotate(18f)
                .into(binding.imageView)
        }

    }
}