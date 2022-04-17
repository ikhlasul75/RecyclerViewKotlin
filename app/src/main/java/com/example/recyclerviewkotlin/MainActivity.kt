package com.example.recyclerviewkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pembalapList = listOf<Pembalap>(
            Pembalap(
                R.drawable.rossi,
                namePembalap = "Valentino Rossi",
                descPembalap = "Rossi ialah satu - satunya pembalap yang menjuarai word Grandprix sebanyak 9x"
            ),
            Pembalap(
                R.drawable.marc,
                namePembalap = "Marc Marquez",
                descPembalap = "Marc merupakan seorang pembalap muda yang bertalenta ia hampir mengalahkan rekor Rossi"
            ),
            Pembalap(
                R.drawable.dovi,
                namePembalap = "Andrea Dovizioso",
                descPembalap = "Dovi seorang pembalap italy yang berbakat ia pernah membela pabrikan Ducati selama 7 tahun"
            ),
            Pembalap(
                R.drawable.jorge,
                namePembalap = "Jorge Lorenzo",
                descPembalap = "Lorenzo merupakan pembalap berdarah spanyol, ia pernah membawa Yamaha menjuarai dunia MotoGP"
            ),
            Pembalap(
                R.drawable.rins,
                namePembalap = "Alex Rins",
                descPembalap = "Alex sekarang membela tim Suzuki Ecstar, dia masuk dalam 5 besar klasemen saat ini!!"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_pembalap)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = PembalapAdapter(this, pembalapList){
            val intent = Intent (this, DetailPembalapActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}