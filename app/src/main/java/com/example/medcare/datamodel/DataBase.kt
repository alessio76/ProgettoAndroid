package com.example.medcare.datamodel

object DataBase {

    // Array per simulare il contenuto del database
    private var medicine = ArrayList<Medicina>()

    // Inizializzatore per popolare il database con qualche dato
    init {
        medicine.add(Medicina("Tachi",20,"K","17:00"))
        medicine.add(Medicina("Kanrenol",25,"O","15:00"))
        medicine.add(Medicina("Lasix",10,"Cu","9:00"))


    }

    // Restituisce l'elenco di tutte le birre presenti
    fun getElencoMed(): ArrayList<Medicina> {
        return medicine
    }

    /**
     * Aggiunge una nuova birra nel database
     */
    fun salvaMed(medicina: Medicina) {
        medicine.add(medicina)
    }
}