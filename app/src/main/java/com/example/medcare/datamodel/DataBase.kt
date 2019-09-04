package com.example.medcare.datamodel

object DataBase {

    // Array per simulare il contenuto del database
    private var medicine = ArrayList<Medicina>()

    // Inizializzatore per popolare il database con qualche dato
    init {
        medicine.add(Medicina("Tachiflu",  30, "K"))
        medicine.add(Medicina("Kanrenol",  20, "O"))
        medicine.add(Medicina("Lasix",  15, "Na"))

    }

    // Restituisce l'elenco di tutte le birre presenti
    fun getElencoMed(): ArrayList<Medicina> {
        return medicine
    }

    /**
     * Aggiunge una nuova birra nel database
     */
    fun salvaMed(birra: Medicina) {
        medicine.add(birra)
    }
}