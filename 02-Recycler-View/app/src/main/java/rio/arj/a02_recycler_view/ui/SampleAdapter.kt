package rio.arj.a02_recycler_view.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import rio.arj.a02_recycler_view.BR
import rio.arj.a02_recycler_view.data.repository.sample.model.SampleModel
import rio.arj.a02_recycler_view.databinding.ItemSampleBinding

class SampleAdapter(
      private val sampleList: List<SampleModel>,
      private val onClickListener: (companyName: String) -> Unit
) : RecyclerView.Adapter<SampleAdapter.ViewHolder>() {

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
    val inflater = LayoutInflater.from(parent.context)
    val viewDataBinding = ItemSampleBinding.inflate(inflater, parent, false)
    return ViewHolder(viewDataBinding)
  }

  override fun getItemCount(): Int {
    return sampleList.size
  }

  override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    holder.bind(sampleList[position], onClickListener)
  }

  class ViewHolder(private val itemBinding: ItemSampleBinding) :
        RecyclerView.ViewHolder(itemBinding.root) {
    fun bind(model: SampleModel, onClickListener: (companyName: String) -> Unit) {
      itemBinding.setVariable(BR.sampleModel, model)
      itemBinding.executePendingBindings()

      itemBinding.root.setOnClickListener {
        onClickListener.invoke(model.companyName)
      }
    }
  }

}