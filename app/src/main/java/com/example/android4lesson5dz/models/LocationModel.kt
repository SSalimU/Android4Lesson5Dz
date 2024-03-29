package com.example.android4lesson5dz.models

import com.google.gson.annotations.SerializedName

data class LocationModel(

    @SerializedName("type")
    val type: String,

    @SerializedName("dimension")
    val dimension: String,

    @SerializedName("id")
    val id: Int
)