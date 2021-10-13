package rio.arj.a02_recycler_view.data.repository.anime.model


import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("anime_id")
    val animeId: Int?,
    @SerializedName("anime_img")
    val animeImg: String?,
    @SerializedName("anime_name")
    val animeName: String?
)