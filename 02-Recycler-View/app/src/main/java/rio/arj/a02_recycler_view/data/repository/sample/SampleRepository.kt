package rio.arj.a02_recycler_view.data.repository.sample

import rio.arj.a02_recycler_view.data.repository.sample.model.SampleModel

interface SampleRepository {
  fun getSampleData(): List<SampleModel>
}
