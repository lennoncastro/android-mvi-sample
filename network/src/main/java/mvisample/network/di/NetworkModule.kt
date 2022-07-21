package mvisample.network.di

import dagger.Binds
import dagger.Module
import mvisample.network.di.httpClient.HttpClient
import mvisample.network.di.httpClient.HttpClientImpl

@Module
abstract class NetworkModule {

    @Binds
    abstract fun bindHttpClient(httpClientImpl: HttpClientImpl): HttpClient
}
