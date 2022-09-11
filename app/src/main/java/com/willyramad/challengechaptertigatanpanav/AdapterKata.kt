package com.willyramad.challengechaptertigatanpanav

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView

class AdapterKata (val listKata  : List<DataKata>) : RecyclerView.Adapter<AdapterKata.ViewHolder>(){
    class ViewHolder (view: View) :RecyclerView.ViewHolder(view){
        val btnkata = view.findViewById<Button>(R.id.btnitem)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterKata.ViewHolder {
    val view = LayoutInflater.from(parent.context).inflate(R.layout.item_abjad,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: AdapterKata.ViewHolder, position: Int) {
        val select = listKata.get(position).kata
        holder.btnkata.text = select
        holder.btnkata.setOnClickListener {
            var link : Uri = Uri.parse("https://www.google.com/search?q=${select}")
            val intent = Intent(Intent.ACTION_VIEW, link)
        }
    }

    override fun getItemCount(): Int {
        return listKata.size
    }
}