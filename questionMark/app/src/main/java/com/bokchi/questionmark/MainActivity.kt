package com.bokchi.questionmark

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val value : String? = "a"
        val value2 : String? = null

        // ? -> null일 수 있음!
        // ! -> null이 아님!

    }
}