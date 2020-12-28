package somiah.jad.earthquake

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import somiah.jad.earthquake.api.EarthQuakeFetcher
import somiah.jad.earthquake.models.Features

class EarthQuakeViewModel : ViewModel() {
    val quakesLiveData: LiveData<List<Features>>

    init {
        quakesLiveData = EarthQuakeFetcher().fitchQuakers()
    }
}