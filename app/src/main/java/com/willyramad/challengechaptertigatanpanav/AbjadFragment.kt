package com.willyramad.challengechaptertigatanpanav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_abjad.*

class AbjadFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_abjad, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val listabjad = arrayListOf(
            DataAbjad("A"),
            DataAbjad("B"),
            DataAbjad("C"),
            DataAbjad("D"),
            DataAbjad("E"),
            DataAbjad("F"),
            DataAbjad("G"),
            DataAbjad("H"),
            DataAbjad("I"),
            DataAbjad("J"),
            DataAbjad("K"),
            DataAbjad("L"),

        )
        val adapter = AdapterAbjad(listabjad)
        val lm = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        recyclerabjad.layoutManager = lm
        recyclerabjad.adapter = adapter
        adapter.onClick= {
            val bundle = Bundle()
            bundle.putSerializable("abjad",it)
            val fkata = KataFragment()
            fkata.arguments =bundle

            parentFragmentManager
                .beginTransaction()
                .replace(R.id.container, fkata)
                .addToBackStack(null)
                .commit()
        }
    }
}