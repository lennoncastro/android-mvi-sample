package mvisample.network.di

import android.app.Application
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import mvisample.network.di.httpClient.HttpClient
import mvisample.network.di.httpClient.HttpClientImpl
import javax.inject.Singleton

@Module
@InstallIn(Application::class)
abstract class NetworkModule {

    @Singleton
    @Binds
    abstract fun bindHttpClient(httpClientImpl: HttpClientImpl): HttpClient
}
