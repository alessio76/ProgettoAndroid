package com.example.medcare


import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.medcare.datamodel.Medicina
import kotlinx.android.synthetic.main.medicina_fragment.*

class MedicinaFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
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
}
