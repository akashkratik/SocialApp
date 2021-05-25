package com.example.socialapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.socialapp.daos.PostDao

class CreatePostActivity : AppCompatActivity() {
    private lateinit var btnPost : Button
    private lateinit var etPost : EditText
    private lateinit var postDao: PostDao
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_post)

        btnPost = findViewById(R.id.btn_post)
        etPost = findViewById(R.id.et_post)
        btnPost.setOnClickListener {
            postDao = PostDao()
            val post = etPost.text.toString()
            if(post.isNotEmpty()){
                postDao.addPost(post)
                finish()
            }
        }

    }
}