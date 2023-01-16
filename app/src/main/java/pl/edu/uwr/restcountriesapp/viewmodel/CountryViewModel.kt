package pl.edu.uwr.restcountriesapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import pl.edu.uwr.restcountriesapp.model.api.RestCountries
import pl.edu.uwr.restcountriesapp.model.repository.CountriesRepository
import pl.edu.uwr.restcountriesapp.util.Resource
import retrofit2.Response

class CountryViewModel: ViewModel(){
    private val repository = CountriesRepository()

    private val _countryData = MutableLiveData<Resource<RestCountries>>()
    val countryData: LiveData<Resource<RestCountries>> get() = _countryData

    private fun handleRestCountriesResponse(response: Response<RestCountries>)
            : Resource<RestCountries> {
        if (response.isSuccessful)
            response.body()?.let { return Resource.Success(it) }
        return Resource.Error(response.message())
    }

    fun getCountries() = viewModelScope.launch {
        _countryData.postValue(Resource.Loading())

        val response = repository.getCountries()
        _countryData.postValue(handleRestCountriesResponse(response))
    }

    init {
        getCountries()
    }
}