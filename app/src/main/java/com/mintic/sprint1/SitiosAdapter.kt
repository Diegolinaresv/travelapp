package com.mintic.sprint1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_sitios.view.*

class RecyclerAdapter : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    var listaCiudades: MutableList<ListaCiudades> = ArrayList()
    lateinit var context: Context



    fun RecyclerAdapter(listaCiudades : MutableList<ListaCiudades>, context: Context){
        this.listaCiudades = listaCiudades
        this.context = context
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = listaCiudades.get(position)
        holder.bind(item, context)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.item_sitios, parent, false))
    }

    override fun getItemCount(): Int {
        return listaCiudades.size
    }



class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val sitioName = view.findViewById(R.id.tvSitioName) as TextView
    val descripcionSitio = view.findViewById(R.id.tvDescripcionSitio) as TextView
    val image = view.findViewById(R.id.ivSitios) as ImageView
    fun bind(listaCiudades: ListaCiudades, context: Context){
        sitioName.text = listaCiudades.sitioName
        descripcionSitio.text = listaCiudades.descripcionSitio
        itemView.setOnClickListener(View.OnClickListener { Toast.makeText(context, listaCiudades.sitioName, Toast.LENGTH_SHORT).show() })
        image.loadUrl(listaCiudades.images)
    }
    fun ImageView.loadUrl(url: String) {
        Picasso.with(context).load(url).into(this)
    }
}


}





