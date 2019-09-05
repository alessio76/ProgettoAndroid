package com.example.medcare


import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.*
import com.example.medcare.datamodel.Medicina
import kotlinx.android.synthetic.main.medicina_fragment.*

class MedicinaFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //aggiungo questa riga per disporre il Fragment al menù
        setHasOptionsMenu(true)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //aggiungo questa riga per disporre il Fragment al menù
        setHasOptionsMenu(true)
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.medicina_fragment, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //setto l'ActionBar rossa
        (activity as AppCompatActivity).supportActionBar?.setBackgroundDrawable(ColorDrawable(Color.rgb(255,0,0)))

        // Estraggo la particolare medicina dal bundle ed eventualmente la visualizzo
        //let prende l'oggetto su cui è invocato come parametro della funzione tra le {} e questo parametro si richiama con it
        arguments?.let {
            val medicina: Medicina? = it.getParcelable("medicina")
            medicina?.let {
                nomeDettaglio.text = it.nome
                quantitàDettaglio.text = it.quantità.toString()
                principioAttivo.text = it.principio
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater?){
        super.onCreateOptionsMenu(menu, inflater)
        //menu?.clear()
        inflater?.inflate(R.menu.menu_modifica, menu) //visualizzo solo la spunta per l'inserimento
    }
}
