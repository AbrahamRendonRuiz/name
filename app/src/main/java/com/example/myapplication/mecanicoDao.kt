package com.example.pruebadesql

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.myapplication.Mecanic

@Dao
interface mecanicoDao{
    @Insert
    suspend fun insert (mecanicos : mecanico)
    @Query("SELECT * FROM mecanico")
    suspend fun getAll(): LiveData<List<mecanico>>
    @Query("SELECT * FROM mecanico WHERE id = :id")
    suspend fun getById(id: Int): mecanico
    @Update
    suspend fun update(Mecanico: mecanico)
    @Delete
    suspend fun delete(Mecanico: mecanico)
}
