package com.example.postsapp.viewModel

import com.example.postsapp.Api.ApiClient
import com.example.postsapp.Api.ApiInterface
import com.example.postsapp.model.Post
import okhttp3.Dispatcher
import retrofit2.Response

class PostRepository {
    suspend fun getPosts():Response<List<Post>> = withContext(Dispatchers.io){
        val opiClient = ApiClient.buildServeice(ApiInterface::class.java)
        val ApiClient
        val apiClient = null
        val response = apiClient.getPosts()
        return@withContext  response
    }

    private fun withContext(io: Any, any: Any): Response<List<Post>> {

    }

}

private fun Nothing?.getPosts(): {

}
