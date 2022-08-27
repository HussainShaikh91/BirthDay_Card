package com.example.birthdaycard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Toast
import com.example.birthdaycard.databinding.ActivityBirthdayBinding
import com.example.birthdaycard.databinding.ActivityMainBinding
import com.example.birthdaycard.databinding.ActivityMainBinding.bind
import com.example.birthdaycard.databinding.ActivityMainBinding.inflate

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private var doubleBackToExitPressedOnce = false

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

    override fun onBackPressed() {
        if (doubleBackToExitPressedOnce){
            super.onBackPressed()
            return
        }
        this.doubleBackToExitPressedOnce = true
        //show Toast
        Toast.makeText(this,"Please Press Back again to exit!",Toast.LENGTH_SHORT).show()
        //decide time to click on back after showing toast
        Handler(Looper.getMainLooper()).postDelayed(Runnable { doubleBackToExitPressedOnce = false },2000) //2000 millis is equal to 2 seconds

    }

}