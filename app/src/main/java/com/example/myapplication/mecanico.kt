package com.example.pruebadesql

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class mecanico(
    @PrimaryKey(autoGenerate = true)
    val id : Int,
    val name : String,
    val sName : String,
    val location : String
){

}

fun constructor(){

}
