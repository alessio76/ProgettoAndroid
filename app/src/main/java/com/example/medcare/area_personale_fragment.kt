package com.example.medcare


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.medcare.datamodel.DataBase
import kotlinx.android.synthetic.main.area_personale_fragment.*

/**
 * A simple [Fragment] subclass.
 */
class area_personale_fragment : Fragment() {

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

        // Imposto il layout manager a lineare per avere scrolling in una direzione
        listaMedicine.layoutManager = LinearLayoutManager(activity)

        // Associo l'adapter alla RecyclerView
        adapter = Adapter(DataBase.getElencoMed(), requireContext())
        listaMedicine.adapter = adapter


    }

}
