package somiah.jad.earthquake.api


import retrofit2.Call
import retrofit2.http.GET

interface EarthQuakeApi {

    @GET("query?format=geojson&limit=10")
    fun fitchQuakes(): Call<EarthQuakeResponse>
}