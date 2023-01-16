package pl.edu.uwr.restcountriesapp.model.api

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import pl.edu.uwr.restcountriesapp.util.baseUrl
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

//https://restcountries.com/v3.1/all?fields=name,capital,flag
interface RestCountriesApi{
    @GET("all")
    suspend fun call(
        @Query("fields") fields:String = "name,capital,flag"
    ): Response<RestCountries>
}

object RetrofitInstance {
    val api: RestCountriesApi by lazy {
        val logging = HttpLoggingInterceptor()
        logging.setLevel(HttpLoggingInterceptor.Level.BODY)

        val client = OkHttpClient.Builder()
            .addInterceptor(logging)
            .build()

        Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .client(client)
            .build()
            .create(RestCountriesApi::class.java)
    }
}