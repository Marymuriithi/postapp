package com.example.postsapp.viewModel

import android.os.Parcel
import android.os.Parcelable
import androidx.lifecycle.ViewModel
import java.lang.IllegalArgumentException
import kotlin.co.postsapp.repository.PostRepository

class postViewModelFactory (val postRepository: postsRepository): postViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): postViewModel {
        if (modelClass.isAssignableFrom(postsViewModel::class.java)){
            return postViewModel(postRepository)

        }
        throw IllegalArgumentException("Unknown viewmodel class")
    }


}

class postsViewModel {

}

class postsRepository {

}

class postViewModelProvider {

}
