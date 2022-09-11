package com.willyramad.challengechaptertigatanpanav

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView

class AdapterAbjad (val listabjad  : List<DataAbjad>): RecyclerView.Adapter<AdapterAbjad.ViewHolder>() {

    var onClick : ((DataAbjad) -> Unit)? = null
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val button = view.findViewById<Button>(R.id.btnitem)

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterAbjad.ViewHolder {
    val view = LayoutInflater.from(parent.context).inflate(R.layout.item_abjad,parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: AdapterAbjad.ViewHolder, position: Int) {
        val view = listabjad.get(position).abjad
        holder.button.text = view
        holder.button.setOnClickListener{
            onClick?.invoke(listabjad[position])
            val abjadFragment = AbjadFragment()
            val bundle = Bundle()
            bundle.putSerializable("abjad",DataAbjad(view))
            abjadFragment.arguments = bundle
            var  activity : AppCompatActivity = holder.itemView.context as AppCompatActivity
            it.findNavController().navigate(R.id.action_abjadFragment_to_kataFragment)
        }
    }

    override fun getItemCount(): Int {
        return listabjad.size
    }
}