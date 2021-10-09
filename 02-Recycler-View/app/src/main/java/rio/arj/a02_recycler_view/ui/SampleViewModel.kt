package rio.arj.a02_recycler_view.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import rio.arj.a02_recycler_view.data.repository.sample.SampleRepositoryImpl
import rio.arj.a02_recycler_view.data.repository.sample.model.SampleModel

class SampleViewModel : ViewModel() {

  var sampleModel = MutableLiveData<List<SampleModel>>()
    private set

  init {
    getSampleModel()
  }

  /**
   * retrieve sample data from repository and add into sampleModel
   */
  private fun getSampleModel() {
    val sampleRepo = SampleRepositoryImpl()
    sampleModel.value = sampleRepo.getSampleData()
  }
}