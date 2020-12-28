package somiah.jad.earthquake.api

import com.google.gson.annotations.SerializedName
import somiah.jad.earthquake.models.Features

class EarthQuakeResponse {
    //    @SerializedName("features")
    lateinit var features: List<Features>
}