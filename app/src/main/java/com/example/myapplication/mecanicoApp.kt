package com.example.pruebadesql

import android.app.Application
import androidx.room.Room

class mecanicoApp: Application(){
    val room = Room
        .databaseBuilder(this,mecanicodb::class.java, "mecanico")
        .build()
}