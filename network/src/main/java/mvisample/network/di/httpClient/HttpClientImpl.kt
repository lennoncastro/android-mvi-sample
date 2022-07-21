package mvisample.network.di.httpClient

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class HttpClientImpl(override val baseURL: String?) : HttpClient() {

    private var retrofitClient: Retrofit = Retrofit.Builder()
        .baseUrl(baseURL ?: System.getenv("URL_BASE"))
        .addConverterFactory(GsonConverterFactory.create())
        .build()
}