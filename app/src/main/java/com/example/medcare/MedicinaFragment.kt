package com.example.medcare


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

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

        // Estraggo il parametro (birra) dal bundle ed eventualmente lo visualizzo
        arguments?.let {
            val medicina: Medicina? = it.getParcelable("birra")
            medicina?.let {
                textNome.text = it.nome
                textProduttore.text = it.produttore
                textGradazione.text = String.format("%.2f", it.gradazione)
            }
        }
    }
}
