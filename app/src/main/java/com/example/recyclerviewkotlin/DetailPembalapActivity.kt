package com.example.recyclerviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailPembalapActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_pembalap)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val pembalap = intent.getParcelableExtra<Pembalap>(MainActivity.INTENT_PARCELABLE)

        val imgPembalap = findViewById<ImageView>(R.id.img_item_photo)
        val namePembalap = findViewById<TextView>(R.id.tv_item_name)
        val descPembalap = findViewById<TextView>(R.id.tv_item_description)

        imgPembalap.setImageResource(pembalap?.imgPembalap!!)
        namePembalap.text = pembalap.namePembalap
        descPembalap.text = pembalap.descPembalap


    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}