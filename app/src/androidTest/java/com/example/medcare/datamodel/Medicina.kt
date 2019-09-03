package com.example.medcare.datamodel

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Medicina(var nome:String,var numero:Int, var principio:String) : Parcelable