package com.example.medcare


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.medcare.datamodel.Medicina
import kotlinx.android.synthetic.main.medicina_fragment.*

/**
 * A simple [Fragment] subclass.
 */
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

        // Estraggo la particolare medicina dal bundle ed eventualmente la visualizzo
        //let prende l'oggetto su cui è invocato come parametro della funzione tra le {} e questo prametro si richiama con it
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
