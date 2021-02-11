package me.alberto.football.data.remote.restclient

import com.google.gson.GsonBuilder
import me.alberto.football.BuildConfig
import me.alberto.football.util.Urls.BASE_URL
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Inject

class RemoteClient @Inject constructor() {
    companion object {
        private const val TIMEOUT: Long = 50
        private val gson = GsonBuilder().create()
        private const val API_KEY = "a4df190c781447afaf972fca03ef1380"
    }

    private val api: ApiService

    init {
        val loggingInterceptor = makeLoggingInterceptor(BuildConfig.DEBUG)
        val httpClient = OkHttpClient.Builder()
            .apply {
                connectTimeout(TIMEOUT, TimeUnit.SECONDS)
                writeTimeout(TIMEOUT, TimeUnit.SECONDS)
                readTimeout(TIMEOUT, TimeUnit.SECONDS)
                addInterceptor(loggingInterceptor)
                addInterceptor { chain ->
                    val request =
                        chain.request().newBuilder().addHeader("X-Auth-Token", API_KEY).build()
                    chain.proceed(request)
                }
            }

        val client = httpClient.build()
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .client(client)
            .build()
        api = retrofit.create(ApiService::class.java)
    }

    private fun makeLoggingInterceptor(debug: Boolean): HttpLoggingInterceptor {
        val logging = HttpLoggingInterceptor()
        logging.level = if (debug) {
            HttpLoggingInterceptor.Level.BODY
        } else {
            HttpLoggingInterceptor.Level.NONE
        }
        return logging
    }

    fun getRemote(): ApiService = api
}