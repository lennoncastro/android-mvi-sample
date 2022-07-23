package mvisample.network.di.httpClient

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Inject

class HttpClientImpl @Inject constructor() : HttpClient {

    private var retrofitClient: Retrofit = Retrofit.Builder()
        .baseUrl("https://api.github.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    override fun <T> createService(service: Class<T>): T {
        return retrofitClient.create(service)
    }
}