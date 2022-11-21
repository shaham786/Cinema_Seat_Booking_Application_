package com.example.figmapracticeapp.ui.model

import android.os.Parcel
import android.os.Parcelable

data class SeatingArangementModel(
    val seatView: Int,
    var isAvailable: Boolean = false,
    var isSelected: Boolean = false
    ):Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readByte() != 0.toByte(),
        parcel.readByte() != 0.toByte()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(seatView)
        parcel.writeByte(if (isAvailable) 1 else 0)
        parcel.writeByte(if (isSelected) 1 else 0)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<SeatingArangementModel> {
        override fun createFromParcel(parcel: Parcel): SeatingArangementModel {
            return SeatingArangementModel(parcel)
        }

        override fun newArray(size: Int): Array<SeatingArangementModel?> {
            return arrayOfNulls(size)
        }
    }
}



