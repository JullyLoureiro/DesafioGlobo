package com.example.desafioglobo.model

import com.google.gson.annotations.SerializedName
import java.sql.Blob

data class Artigos(
    @SerializedName("id")
    var id : Int = 0,
    @SerializedName("titulo")
    var titulo : String = "",
    @SerializedName("texto")
    var texto : String = "",
    @SerializedName("data")
    var data : String = "",
    @SerializedName("autor")
    var autor : String = "",
    @SerializedName("link")
    var link : String = "",
    @SerializedName("imagens")
    var imagens : ArrayList<String> = arrayListOf()
)