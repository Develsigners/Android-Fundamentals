package rio.arj.a02_recycler_view.ui

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import rio.arj.a02_recycler_view.R
import rio.arj.a02_recycler_view.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

  lateinit var viewModel: AnimeViewModel
  lateinit var binding: ActivityMainBinding

  lateinit var animeAdapter: AnimeAdapter

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    viewModel = ViewModelProvider(this).get(AnimeViewModel::class.java)
    binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
    binding.viewModel = viewModel
    binding.lifecycleOwner = this

    /**
     * Observer to listen new data inserted from animeList on AnimeViewModel::class
     */
    viewModel.animeList.observe(this, { sampleList ->
      if (sampleList.data != null && sampleList.data.isNotEmpty()) {
        /**
         * Implement High Order Function to listen click from adapter.
         * This approach to reduce creating listener for basic implementation.
         * If you wanna override more than one function, you can create Interface.
         */
        animeAdapter = AnimeAdapter(sampleList.data) { companyName ->
          Toast.makeText(this, companyName, Toast.LENGTH_SHORT).show()
        }
        binding.recyclerSampleModel.apply {
          layoutManager = GridLayoutManager(this@MainActivity, 2)
          adapter = animeAdapter
        }
      }
    })
  }
}