package rio.arj.a02_recycler_view.data.repository.anime

import rio.arj.a02_recycler_view.data.repository.anime.model.AnimeModel
import rio.arj.a02_recycler_view.network.ApiService

class AnimeRepositoryImpl(private val apiService: ApiService) : AnimeRepository {

  /**
   * getAnimeLIst() is responsible to retrieve list from HTTP request and make it from coroutine
   * suspend function.
   **/

  override suspend fun getAnimeList(): AnimeModel? {
    return apiService.getAnime()
  }

}