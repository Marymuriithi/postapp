package com.example.postsapp.Api

import com.example.postsapp.model.Post
import retrofit2.Response
import retrofit2.http.GET

interface ApiInterface {
    @GET(value= "Post")
    suspend fun getposts():Response<LIST<Post>>



}

class LIST<T> {

}
