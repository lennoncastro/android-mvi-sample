package mvisample.network.di

import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
object NetworkModule {

    private fun provideHttpClient(baseURL: String): Retrofit {
        return Retrofit.Builder()
            .baseUrl(baseURL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    fun <T> provideService(clazz: Class<T>): T {
        return provideHttpClient("https://example.com").create(clazz)
    }
}
