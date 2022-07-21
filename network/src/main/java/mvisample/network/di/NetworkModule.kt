package mvisample.network.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import mvisample.network.di.httpClient.HttpClient
import mvisample.network.di.httpClient.HttpClientImpl

@Module
@InstallIn(ActivityComponent::class)
abstract class NetworkModule {

    @Binds
    abstract fun bindHttpClient(httpClientImpl: HttpClientImpl): HttpClient
}
