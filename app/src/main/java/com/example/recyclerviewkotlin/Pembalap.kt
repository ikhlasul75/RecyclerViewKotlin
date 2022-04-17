package com.example.recyclerviewkotlin

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Pembalap(
    val imgPembalap: Int,
    val namePembalap: String,
    val descPembalap: String
) : Parcelable
