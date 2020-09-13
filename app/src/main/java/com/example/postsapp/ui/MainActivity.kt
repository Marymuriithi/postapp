package com.example.postsapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.postsapp.R
import com.example.postsapp.viewModel.PostRepository
import com.example.postsapp.viewModel.postViewModel
import com.example.postsapp.viewModel.postViewModelFactory as postViewModelFactory1

private val ViewModelProvider.postsFailedLiveData: Any
    get() {}

class MainActivity : AppCompatActivity() {
    Lateinit
    private var PostViewModelFactory: Any
    lateinit var postViewModel: postViewModel
    Lateinit lateinit var PostviewmodelFactory: postViewModelFactory1

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val postRepository = PostRepository()
        PostViewModelFactory = PostviewmodelFactory(postRepository)
        postViewModel =
            ViewModelProvider(owner:
        val mainActivity = this;postViewModelFactory1).get(PostViewModel::class.java)
        postViewModel.getPost()

        postViewModel.postsLiveData.observe(owner: this, Observer{ postsList ->
            Toast.makeText(baseContext, text "${postsList.size} posts fetched", Toast.LENGTH_LONG).show()

        })
        postViewModel.postsFailedLiveData.observe(owner this, Observer{error->
            Toast.makeText(baseContext, error, Toast.LENGTH_LONG).show()
        })
    }


}