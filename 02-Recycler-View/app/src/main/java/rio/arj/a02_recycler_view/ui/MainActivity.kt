package rio.arj.a02_recycler_view.ui

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import rio.arj.a02_recycler_view.R
import rio.arj.a02_recycler_view.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

  lateinit var viewModel: SampleViewModel
  lateinit var binding: ActivityMainBinding

  lateinit var sampleAdapter: SampleAdapter

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    viewModel = ViewModelProvider(this).get(SampleViewModel::class.java)
    binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
    binding.viewModel = viewModel
    binding.lifecycleOwner = this

    /**
     * Observer to listen new data inserted from sampleModel on SampleViewModel::class
     */
    viewModel.sampleModel.observe(this, { sampleList ->
      if (sampleList.isNotEmpty()) {
        /**
         * Implement High Order Function to listen click from adapter.
         * This approach to reduce creating listener for basic implementation.
         * If you wanna override more than one function, you can create Interface.
         */
        sampleAdapter = SampleAdapter(sampleList) { companyName ->
          Toast.makeText(this, companyName, Toast.LENGTH_SHORT).show()
        }
        binding.recyclerSampleModel.apply {
          layoutManager = LinearLayoutManager(this@MainActivity)
          adapter = sampleAdapter
        }
      }
    })
  }
}