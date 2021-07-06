package com.example.number_one

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PageThreeActivity : AppCompatActivity() {
    private lateinit var gotoPage_One: Button
    private lateinit var gotoPage_Two: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_three)

        gotoPage_One = findViewById(R.id.btGotoPage_One)
        gotoPage_Two = findViewById(R.id.btGotoPage_Two)

        gotoPage_One.setOnClickListener{
            gotoPage_One()
        }

        gotoPage_Two.setOnClickListener{
            gotoPage_Two()
        }
    }

    private fun gotoPage_One(){
        val myIntent = Intent(this, MainActivity::class.java)
        startActivity(myIntent)
    }

    private fun gotoPage_Two(){
        val myIntent = Intent(this, PageTwoActivity::class.java)
        startActivity(myIntent)
    }
}