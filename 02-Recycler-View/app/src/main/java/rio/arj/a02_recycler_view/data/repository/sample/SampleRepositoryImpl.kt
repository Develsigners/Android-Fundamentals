package rio.arj.a02_recycler_view.data.repository.sample

import rio.arj.a02_recycler_view.data.repository.sample.model.SampleModel

class SampleRepositoryImpl : SampleRepository {

  /**
   * getSampleData() is responsible to retrieve list from for i approach and add them into SampleModel.
   * To retrieve data from remote, you have to make a HTTP request in this repository
   * depend on whats data you need.
   **/

  override fun getSampleData(): List<SampleModel> {
    val sampleModelList = mutableListOf<SampleModel>()
    for (i in 1..20) {
      sampleModelList.add(
            SampleModel(
                  id = i.toString(),
                  name = "Name $i",
                  companyName = "Company $i"
            )
      )
    }
    return sampleModelList
  }

}