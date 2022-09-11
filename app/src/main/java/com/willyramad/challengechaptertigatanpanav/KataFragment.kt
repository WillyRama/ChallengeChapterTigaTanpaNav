package com.willyramad.challengechaptertigatanpanav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_abjad.*

class KataFragment : Fragment() {
    lateinit var  listkata : ArrayList<DataKata>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_kata, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val ambilabjad = arguments?.getSerializable("abjad") as DataAbjad
        val ambilkata = ambilabjad.abjad
        listkata = when (ambilkata) {
            "A" -> {
                arrayListOf(DataKata("Aku"), DataKata("Ada"), DataKata("Abu"))
            }
            "B" -> {
                arrayListOf(DataKata("BISU"), DataKata("BUKAN"), DataKata("BUTA"))
            }
            "C" -> {
                arrayListOf(DataKata("CURHAT"), DataKata("CACATAN"), DataKata("CINTA"))
            }
            "D" -> {
                arrayListOf(DataKata("DADA"), DataKata("DIBELAH"), DataKata("DARAT"))
            }
            "E" -> {
                arrayListOf(DataKata("ELANG"), DataKata("ELIT"), DataKata("ETNIS"))
            }
            "F" -> {
                arrayListOf(DataKata("FANTA"), DataKata("FASTER"), DataKata("FIFA"))
            }
            "G" -> {
                arrayListOf(DataKata("GAGAH"), DataKata("GAGAK"), DataKata("GAGAP"))
            }
            "H" -> {
                arrayListOf(DataKata("HANTU"), DataKata("HIDUP"), DataKata("HANCUR"))
            }
            "I" -> {
                arrayListOf(DataKata("ITIK"), DataKata("ISI"), DataKata("ISUZU"))
            }
            "J" -> {
                arrayListOf(DataKata("JANJI"), DataKata("JUGA"), DataKata("JOROK"))
            }
            "K" -> {
                arrayListOf(DataKata("KAKI"), DataKata("KUAT"), DataKata("KESELEO"))
            }
            "L" -> {
                arrayListOf(DataKata("LARI"), DataKata("LEMES"), DataKata("LESU"))
            }
            else -> arrayListOf()
        }
        val adapter = AdapterKata(listkata)
        val lm = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        recyclerabjad.layoutManager = lm
        recyclerabjad.adapter = adapter
    }
}