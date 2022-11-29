package com.example.figmapracticeapp.ui.model

import android.os.Parcel
import android.os.Parcelable

data class Fooddata(val textView: String?, val imageView: Int, val trailer: String?):Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readInt(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(textView)
        parcel.writeInt(imageView)
        parcel.writeString(trailer)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Fooddata> {
        override fun createFromParcel(parcel: Parcel): Fooddata {
            return Fooddata(parcel)
        }

        override fun newArray(size: Int): Array<Fooddata?> {
            return arrayOfNulls(size)
        }
    }
}
