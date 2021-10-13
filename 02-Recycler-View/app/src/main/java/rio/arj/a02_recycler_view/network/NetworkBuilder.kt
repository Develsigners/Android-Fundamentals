package rio.arj.a02_recycler_view.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class NetworkBuilder {
  companion object Builder {
    /**
     * Create instance of retrofit2 and GSON converter
     */
    private fun getInstance() = Retrofit.Builder()
      .baseUrl("https://anime-facts-rest-api.herokuapp.com/")
      .addConverterFactory(GsonConverterFactory.create())
      .build()

    fun getService(): ApiService = getInstance().create(ApiService::class.java)
  }
}