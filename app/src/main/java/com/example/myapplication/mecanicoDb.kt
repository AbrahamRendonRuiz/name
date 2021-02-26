package com.example.pruebadesql



import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [mecanico::class],
    version = 1

)
abstract class mecanicodb : RoomDatabase(){
    abstract fun mecanicoDao(): mecanicoDao
}