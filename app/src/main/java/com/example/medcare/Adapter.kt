package com.example.medcare

import android.content.Context
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.medcare.datamodel.Medicina

class Adapter(val dataset: ArrayList<Medicina>, val context: Context) : RecyclerView.Adapter<RigaMedViewHolder>() {

    // Invocata per creare un ViewHolder
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): RigaMedViewHolder {
        // Crea e restituisce un viewholder, effettuando l'inflate del layout relativo alla riga
        return RigaMedViewHolder(LayoutInflater.from(context).inflate(R.layout.riga_med, viewGroup, false))
    }

    // Invocata per conoscere quanti elementi contiene il dataset
    override fun getItemCount(): Int {
        return dataset.size
    }

    // Invocata per visualizzare all'interno del ViewHolder il dato corrispondente alla riga
    override fun onBindViewHolder(viewHolder: RigaMedViewHolder, position: Int) {
        val med = dataset.get(position)

        viewHolder.nome.text = med.nome


        // Imposto il listner per passare a visualizzare il dettaglio
        viewHolder.itemView.setOnClickListener {

            // Creo un bundle e vi inserisco la birra da visualizzare
            val a = Bundle()
            a.putParcelable("medicina", med)     //TODO: Il nome dell'ogggetto andrebbe inserito in un solo punto!!
            Navigation.findNavController(it).navigate(R.id.action_area_personale_fragment_to_medicinaFragment, a)
        }
    }
}