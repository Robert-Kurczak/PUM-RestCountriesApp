package pl.edu.uwr.restcountriesapp.view

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import pl.edu.uwr.restcountriesapp.databinding.FragmentCountriesBinding
import pl.edu.uwr.restcountriesapp.model.api.RestCountriesItem

enum class CountryInfo{
    Capital,
    Flag
}

class CountriesViewHolder(
    private val binding: FragmentCountriesBinding,
    private val info: CountryInfo
    ): RecyclerView.ViewHolder(binding.root){

    fun bind(item: RestCountriesItem){
        binding.countryName.text = item.name.official

        if(info == CountryInfo.Capital){
            binding.capitalName.visibility = View.VISIBLE
            binding.capitalName.text = item.capital.first()

            binding.countryFlag.visibility = View.GONE
        }
        else if(info == CountryInfo.Flag){
            binding.capitalName.visibility = View.GONE

            binding.countryFlag.visibility = View.VISIBLE
            binding.countryFlag.text = item.flag
        }
    }
}

class CountriesCapitalsComparator : DiffUtil.ItemCallback<RestCountriesItem>() {
    override fun areItemsTheSame(oldItem: RestCountriesItem, newItem: RestCountriesItem): Boolean {
        return oldItem.name.official == newItem.name.official
    }

    override fun areContentsTheSame(oldItem: RestCountriesItem, newItem: RestCountriesItem): Boolean {
        return oldItem == newItem
    }
}

class CountriesAdapter(itemComparator: CountriesCapitalsComparator, private val info: CountryInfo)
    : ListAdapter<RestCountriesItem, CountriesViewHolder>(itemComparator) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountriesViewHolder{
        return CountriesViewHolder(
            FragmentCountriesBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            ),
            info
        )
    }

    override fun onBindViewHolder(holder: CountriesViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }
}