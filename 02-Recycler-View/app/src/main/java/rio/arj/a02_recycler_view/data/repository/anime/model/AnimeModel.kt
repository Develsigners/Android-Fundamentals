package rio.arj.a02_recycler_view.data.repository.anime.model


import com.google.gson.annotations.SerializedName

data class AnimeModel(
    @SerializedName("data")
    val `data`: List<Data>?
)