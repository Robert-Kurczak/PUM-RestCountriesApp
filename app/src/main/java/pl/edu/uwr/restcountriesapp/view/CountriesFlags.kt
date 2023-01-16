package pl.edu.uwr.restcountriesapp.view

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import pl.edu.uwr.restcountriesapp.databinding.FragmentCountriesListBinding
import pl.edu.uwr.restcountriesapp.util.Resource
import pl.edu.uwr.restcountriesapp.viewmodel.CountryViewModel

class CountriesFlags : Fragment() {
    private val viewModel: CountryViewModel by viewModels()
    private lateinit var binding: FragmentCountriesListBinding

    private fun setupRecyclerView(countriesAdapter: CountriesAdapter) {
        binding.recyclerView.apply {
            adapter = countriesAdapter
            layoutManager = LinearLayoutManager(requireContext())
        }
    }

    private fun observeCountriesList(countriesAdapter: CountriesAdapter) {
        viewModel.countryData.observe(viewLifecycleOwner) { response ->
            when (response) {
                is Resource.Loading -> {
                    Log.e("CountriesCapitals", "Loading...")
                }
                is Resource.Error -> {
                    response.message?.let { Log.e("CountriesCapitals", "Error occurred: $it") }
                }
                is Resource.Success -> {
                    response.data?.let { countriesAdapter.submitList(it) }
                }
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCountriesListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = CountriesAdapter(CountriesCapitalsComparator(), CountryInfo.Flag)

        setupRecyclerView(adapter)
        observeCountriesList(adapter)
    }
}