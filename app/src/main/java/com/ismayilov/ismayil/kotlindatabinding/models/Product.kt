package com.ismayilov.ismayil.kotlindatabinding.models

import android.os.Parcel
import android.os.Parcelable

class Product(val title:String,val description:String,
              val imageProduct:Int,val price:Double,
              val offerPrice:Double,val raitingCount:Int,
              val raitingBar:Float,val serial:Int):Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readInt(),
        parcel.readDouble(),
        parcel.readDouble(),
        parcel.readInt(),
        parcel.readFloat(),
        parcel.readInt()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(title)
        parcel.writeString(description)
        parcel.writeInt(imageProduct)
        parcel.writeDouble(price)
        parcel.writeDouble(offerPrice)
        parcel.writeInt(raitingCount)
        parcel.writeFloat(raitingBar)
        parcel.writeInt(serial)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Product> {
        override fun createFromParcel(parcel: Parcel): Product {
            return Product(parcel)
        }

        override fun newArray(size: Int): Array<Product?> {
            return arrayOfNulls(size)
        }
    }

    fun isOfferAvaible() : Boolean{
        return offerPrice > 0
    }

    fun getCountConvertToString(count: Int):String{
        return "Miqdar: $count"
    }


}