package somiah.jad.earthquake.models


import com.google.gson.annotations.SerializedName

data class Features(

//    @SerializedName("type") var type : String,
    @SerializedName("properties") var properties: Properties,
    @SerializedName("geometry") var geometry: Geometry,
    @SerializedName("id") var id: String

)

data class Properties(

    @SerializedName("mag") var mag: Double,
    @SerializedName("place") var place: String,
    @SerializedName("time") var time: Long
)

data class Geometry(

//    @SerializedName("type") var type : String,
    @SerializedName("coordinates") var coordinates: List<Double>

)