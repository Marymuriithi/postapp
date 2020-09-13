package com.example.postsapp.viewModel

import androidx.lifecycle.ViewModelProvider
import com.example.postsapp.model.Post
import ke.co.postsapp.models.Post
import ke.co.postsapp.repository.PostRepository
import androidx.lifecycle.MutableLiveData as MutableLiveData1

class postViewModel(postRepository: Any) {val postRepository: PostRepository): ViewModelProvider()
    get() { ()
    }

    {
    var postLiveData = MutableLiveData1<List<Post>>()
    var postFailedLiveData = MutableLiveData1<String>()

    fun getPost(){
        val viewModelScope = null
        viewModelScope.setValue{
            val postsRepository =

            val response = postsRepository.getPost()
            if (response.isSuccessful){
                postLiveData.postValue(response.body())
            }
            else{
                postFailedLiveData.postValue(response.errorBody()?.string())
            }
        }
    }
}
}