package com.example.medcare


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.*


class InserimentoFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //aggiungo questa riga per disporre il Fragment al menù
        setHasOptionsMenu(true)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        setHasOptionsMenu(true)
        return inflater.inflate(R.layout.fragment_inserimento, container, false)
    }

    override fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater?){
        super.onCreateOptionsMenu(menu, inflater)
        //menu?.clear()
        inflater?.inflate(R.menu.menu_inserimento, menu) //visualizzo solo la spunta per l'inserimento
    }



}