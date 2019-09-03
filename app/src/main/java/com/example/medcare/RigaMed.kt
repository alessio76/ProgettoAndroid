package com.example.medcare

import android.support.v7.widget.RecyclerView
import android.view.View
import kotlinx.android.synthetic.main.riga_med.view.*

//elemento della lista di Medicine
class RigaMed (view: View) : RecyclerView.ViewHolder(view) {
    val Orario = view.OrarioMed
    val Nome = view.NomeMed
    val Immagine=view.MedPic
    val Box=view.checkBox
}