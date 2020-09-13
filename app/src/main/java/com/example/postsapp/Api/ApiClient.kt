package com.example.postsapp.Api

import com.google.gson.Gson
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.CompletionService
import retrofit2.Response

object ApiClient {
    fun buildServeice(java: Class<ApiInterface>): Any {

    }
}

var client = OkHttpClient.Builder().build()
var retrofit = Retrofit.Builder()
    .addConverterFactory(GsonConverterFactory.create())
    .client(client)
    .build()
fun <T>BuilderService(service: Class<T>):T{
    return retrofit.create(service)
}
}