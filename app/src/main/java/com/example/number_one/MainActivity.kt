package com.example.number_one

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity

class MainActivity : AppCompatActivity() {
    private lateinit var gotoPageTwo: Button
    private lateinit var gotoPageThree: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        gotoPageTwo = findViewById(R.id.btGotoPageTwo)
        gotoPageThree = findViewById(R.id.btGotoPageThree)

        gotoPageTwo.setOnClickListener{
            gotoPageTwo()
        }

        gotoPageThree.setOnClickListener{
            gotoPageThree()
        }

    }

    private fun gotoPageTwo(){
        val myIntent = Intent(this, PageTwoActivity::class.java)
        startActivity(myIntent)
    }

    private fun gotoPageThree(){
        val myIntent = Intent(this, PageThreeActivity::class.java)
        startActivity(myIntent)
    }
}

