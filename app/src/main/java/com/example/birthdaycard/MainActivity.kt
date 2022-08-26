package com.example.birthdaycard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.birthdaycard.databinding.ActivityBirthdayBinding
import com.example.birthdaycard.databinding.ActivityMainBinding
import com.example.birthdaycard.databinding.ActivityMainBinding.bind
import com.example.birthdaycard.databinding.ActivityMainBinding.inflate

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = inflate(layoutInflater)
        val view = binding.root //you can use directly setContentView(binding.root)
        setContentView(view)

        binding.btncreate.setOnClickListener {
            var name = binding.enterTxt.text.toString()
            if (name == ""){
                Toast.makeText(this, "Please Enter Name", Toast.LENGTH_SHORT).show()

            }else{
                val intent = Intent(this@MainActivity,BirthdayActivity::class.java);
                intent.putExtra("name", name)
                startActivity(intent);
            }
        }
    }
}