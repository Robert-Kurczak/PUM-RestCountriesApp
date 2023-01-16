package pl.edu.uwr.restcountriesapp.model.repository

import pl.edu.uwr.restcountriesapp.model.api.RetrofitInstance

class CountriesRepository{
    suspend fun getCountries() = RetrofitInstance.api.call()
}

