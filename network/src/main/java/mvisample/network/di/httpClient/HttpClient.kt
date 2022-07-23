package mvisample.network.di.httpClient

interface HttpClient {
    fun <T> createService(service: Class<T>): T
}