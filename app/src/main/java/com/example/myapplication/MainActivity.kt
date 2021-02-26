package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.lifecycle.lifecycleScope
import androidx.room.Entity
import com.example.pruebadesql.mecanico
import com.example.pruebadesql.mecanicoApp
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setup()


    }
    val app = applicationContext as mecanicoApp
    fun setup() {
        val button = findViewById<Button>(R.id.btnAdd)
        val txtName = findViewById<EditText>(R.id.txtName)
        val txtSname = findViewById<EditText>(R.id.txtSname)
        val txtLocation = findViewById<EditText>(R.id.txtTaller)
        button.setOnClickListener(View.OnClickListener {
            var name:String = txtName.text.toString()
            var sName = txtSname.text.toString()
            var location = txtLocation.text.toString()

            var mecanic : Mecanic = Mecanic(0,name,sName,location)

            var Mecanico : mecanico = mecanico(0,name,sName,location)
            lifecycleScope.launch{
                val result = app.room.mecanicoDao().insert(Mecanico)
                println(result)
                val mecanicos = app.room.mecanicoDao().getAll()
                println(mecanicos)
            }


        })
    }
}