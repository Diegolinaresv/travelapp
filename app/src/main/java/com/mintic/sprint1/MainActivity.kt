package com.mintic.sprint1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var mRecyclerView : RecyclerView
    val mAdapter : RecyclerAdapter = RecyclerAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpRecyclerView()
    }
    fun setUpRecyclerView(){
        mRecyclerView = findViewById(R.id.rvListaCiudadesList) as RecyclerView
        mRecyclerView.setHasFixedSize(true)
        mRecyclerView.layoutManager = LinearLayoutManager(this)
        mAdapter.RecyclerAdapter(getListaCiudades(), this)
        mRecyclerView.adapter = mAdapter
    }

    fun getListaCiudades(): MutableList<ListaCiudades> {
       var listaCiudades:MutableList<ListaCiudades> = ArrayList()
        listaCiudades.add(ListaCiudades(
            "Parque Botero",
            "Esta plaza alberga 23 esculturas donadas por el maestro Fernando Botero, dos fuentes y espacios peatonales para el disfrute de los transeúntes",
            "https://assets.atlasobscura.com/media/W1siZiIsInVwbG9hZHMvcGxhY2VfaW1hZ2VzLzFhOTI3ZGViLWZmZTYtNDFhYy04ZmZmLTgxOWMxMDMxOWIyOTM3MmE2YTlhYzI0YWFjZGM4Zl9wbGF6YS1ib3Rlcm8tMS5qcGciXSxbInAiLCJ0aHVtYiIsIjEyMDB4PiJdLFsicCIsImNvbnZlcnQiLCItcXVhbGl0eSA4MSAtYXV0by1vcmllbnQiXV0/plaza-botero-1.jpg"
        ))
        listaCiudades.add(ListaCiudades(
            "Mirador de la calera.",
            " vas a poder obtener unas excelentes vistas de Bogotá además que vas a poder probar el famoso “canelazo”",
            "https://mapio.net/images-p/61088240.jpg"
        ))
        listaCiudades.add(ListaCiudades(
            "Cañon de combeima",
            " El cañón del Combeima es una zona de amortiguación del parque nacional natural Los Nevados ",
            "https://blog.redbus.co/wp-content/uploads/2019/04/100_8759.jpg"
        ))
        listaCiudades.add(ListaCiudades(
            "Desierto de la tatacoa",
            "El Desierto de la Tatacoa es la segunda zona árida más extensa de Colombia después de la península de la Guajira, y es uno de los escenarios naturales más atractivos de Colombia",
            "https://encolombia.com/wp-content/uploads/2020/01/Desierto-de-la-Tatacoa-696x391.jpg"
        ))
        listaCiudades.add(ListaCiudades(
            "Puerta de oro de la amazonia",
            "La particularidad única de paisaje dibuja de manera natural un río con dirección recta durante un tramo",
            "https://1.bp.blogspot.com/-u2VnSwMSGc8/XyspPMHM5UI/AAAAAAAAcR4/YkLXgyoZ1YI7Kw2uIrlBVlOSOC33MfaPwCLcBGAsYHQ/s640/portales-de-frag%25C3%25BCita-caquet%25C3%25A1-colombia-paisaje-1.jpg"
        ))
        return listaCiudades

    }




    fun getCiudadesDetalles(): MutableList<CiudadesDetalles> {
        var ciudadesDetalles:MutableList<CiudadesDetalles> = ArrayList()
        ciudadesDetalles.add(CiudadesDetalles(
            "Desierto de la tatacoa",
            "El Desierto de la Tatacoa es la segunda zona árida más extensa de Colombia después de la península de la Guajira, y es uno de los escenarios naturales más atractivos de Colombia",
            "Ubicado a tan solo 40 minutos de Neiva,exactamente a unos pocos minutos del municipio de  villavieja del departamento del Huila ",
                "El desierto puede superar los 45ºC al mediodía y en las noches la temperatura desciende en promedio a 18ºC.",
                "https://encolombia.com/wp-content/uploads/2020/01/Desierto-de-la-Tatacoa-696x391.jpg"
        )
        )
        return ciudadesDetalles

    }


}