package com.mintic.pantalladetalles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var title = findViewById<TextView>(R.id.tv_titulo)
        var ubication= findViewById<TextView>(R.id.tv_ubicacion)
        var description = findViewById<TextView>(R.id.tv_descripcion)
        var temperature = findViewById<TextView>(R.id.tv_temperatura)
        var img = findViewById<ImageView>(R.id.iv_imagen)

    }
}