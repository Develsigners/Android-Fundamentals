package rio.arj.a02_recycler_view.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import rio.arj.a02_recycler_view.data.repository.anime.AnimeRepositoryImpl
import rio.arj.a02_recycler_view.data.repository.anime.model.AnimeModel
import rio.arj.a02_recycler_view.network.NetworkBuilder

class AnimeViewModel : ViewModel() {

  var animeList = MutableLiveData<AnimeModel>()
    private set

  init {
    getSampleModel()
  }

  /**
   * retrieve anime data from repository and add into animeList
   */

  private fun getSampleModel() {
    val sampleRepo = AnimeRepositoryImpl(NetworkBuilder.getService())
    viewModelScope.launch {
      animeList.value = sampleRepo.getAnimeList()
    }
  }
}