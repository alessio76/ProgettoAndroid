package com.example.medcare


import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.medcare.datamodel.DataBase
import kotlinx.android.synthetic.main.area_personale_fragment.*

class AreaPersonale : Fragment() {

    private lateinit var adapter: Adapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.area_personale_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //imposto a rosso il colore dell'ActionBar
        (activity as AppCompatActivity).supportActionBar?.setBackgroundDrawable(ColorDrawable(Color.rgb(255,0,0)))
        // Imposto il layout manager a lineare per avere scrolling in una direzione
        listaMedicine.layoutManager = LinearLayoutManager(activity)

        // Associo l'adapter alla RecyclerView
        adapter = Adapter(DataBase.getElencoMed(), requireContext())
        listaMedicine.adapter = adapter


    }

}
