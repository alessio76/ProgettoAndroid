package com.example.medcare

import android.support.v7.widget.RecyclerView
import android.view.View
import kotlinx.android.synthetic.main.riga_med.view.*

//elemento della lista di Medicine
class RigaMedViewHolder (view: View) : RecyclerView.ViewHolder(view) {
    var orario = view.OrarioMed
    val nome = view.NomeMed
    val immagine=view.MedPic
    var box=view.checkBox
}