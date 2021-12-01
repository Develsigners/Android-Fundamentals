package rio.arj.a02_recycler_view.data.repository.anime

import rio.arj.a02_recycler_view.data.repository.anime.model.AnimeModel

interface AnimeRepository {
  suspend fun getAnimeList(): AnimeModel?
}
