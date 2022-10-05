package com.example.jobsheet14

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {  
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Yellow = findViewById<Button>(R.id.yellow)
        val Purple = findViewById<Button>(R.id.purple)
        val Orange = findViewById<Button>(R.id.orange)
        val Red = findViewById<Button>(R.id.red)
        val Blue = findViewById<Button>(R.id.blue)

        Yellow.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.container , YellowFragment())
            fragmentTransaction.commit()
        }
        Purple.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.container , PurpleFragment())
            fragmentTransaction.commit()
        }
        Orange.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.container , OrangeFragment())
            fragmentTransaction.commit()
        }
        Red.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.container , redFragment())
            fragmentTransaction.commit()
        }
        Blue.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.container , BlueFragment())
            fragmentTransaction.commit()
        }
    }
}