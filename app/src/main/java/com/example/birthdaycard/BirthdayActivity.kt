package com.example.birthdaycard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.birthdaycard.databinding.ActivityBirthdayBinding
import com.example.birthdaycard.databinding.ActivityMainBinding

class BirthdayActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBirthdayBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportActionBar?.hide()

        binding = ActivityBirthdayBinding.inflate(layoutInflater)
        val view = binding.root //you can use directly setContentView(binding.root)
        setContentView(view)

        val wish = intent.getStringExtra("name")
        binding.bithdaywishtext.setText(wish)
    }
}