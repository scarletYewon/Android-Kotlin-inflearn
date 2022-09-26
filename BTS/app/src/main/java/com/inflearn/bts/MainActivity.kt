package com.inflearn.bts

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image1 = findViewById<ImageView>(R.id.bts_image_1)
        val image2 = findViewById<ImageView>(R.id.bts_image_2)
        val image3 = findViewById<ImageView>(R.id.bts_image_3)
        val image4 = findViewById<ImageView>(R.id.bts_image_4)
        val image5 = findViewById<ImageView>(R.id.bts_image_5)
        val image6 = findViewById<ImageView>(R.id.bts_image_6)
        val image7 = findViewById<ImageView>(R.id.bts_image_7)

        image1.setOnClickListener{
            val intent = Intent(this,BTS1Activity::class.java)
            startActivity(intent)
        }
        image2.setOnClickListener{
            val intent = Intent(this,BTS2Activity::class.java)
            startActivity(intent)
        }
        image3.setOnClickListener{
            val intent = Intent(this,BTS3Activity::class.java)
            startActivity(intent)
        }
        image4.setOnClickListener{
            val intent = Intent(this,BTS4Activity::class.java)
            startActivity(intent)
        }
        image5.setOnClickListener{
            val intent = Intent(this,BTS5Activity::class.java)
            startActivity(intent)
        }
        image6.setOnClickListener{
            val intent = Intent(this,BTS6Activity::class.java)
            startActivity(intent)
        }
        image7.setOnClickListener{
            val intent = Intent(this,BTS7Activity::class.java)
            startActivity(intent)
        }




    }
}