package com.example.number_one

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PageTwoActivity : AppCompatActivity() {
    private lateinit var gotoPageOne: Button
    private lateinit var gotoPage_three: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_two)

        gotoPageOne = findViewById(R.id.btGotoPageOne)
        gotoPage_three = findViewById(R.id.btGotoPage_three)

        gotoPageOne.setOnClickListener{
            gotoPageOne()
        }

        gotoPage_three.setOnClickListener{
            gotoPage_three()
        }
    }

    private fun gotoPageOne(){
        val myIntent = Intent(this, MainActivity::class.java)
        startActivity(myIntent)
    }

    private fun gotoPage_three(){
        val myIntent = Intent(this, PageThreeActivity::class.java)
        startActivity(myIntent)
    }
}