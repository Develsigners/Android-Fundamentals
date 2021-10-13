package rio.arj.a02_recycler_view.network

import retrofit2.http.GET
import rio.arj.a02_recycler_view.data.repository.anime.model.AnimeModel

interface ApiService {

  @GET("api/v1")
  suspend fun getAnime(): AnimeModel

}
