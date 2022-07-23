package mvisample.network.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import mvisample.network.di.httpClient.HttpClient
import mvisample.network.di.httpClient.HttpClientImpl

@Module
@InstallIn(SingletonComponent::class)
abstract class NetworkModule {

    @Binds
    abstract fun bindHttpClient(httpClientImpl: HttpClientImpl): HttpClient
}
