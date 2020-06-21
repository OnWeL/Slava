package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var wick=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Air("Expert")
    }

    fun Air(Bund:String){
        Toast.makeText(this,Bund,Toast.LENGTH_LONG)
        wick=5
    }

}