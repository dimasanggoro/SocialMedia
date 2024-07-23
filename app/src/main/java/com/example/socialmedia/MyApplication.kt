package com.example.socialmedia

import android.app.Application
import com.example.socialmedia.mydata.UserRepository
import com.example.socialmedia.mydata.AppDatabase
import com.example.socialmedia.mydata.PostRepository

class MyApplication : Application() {
    val database by lazy { AppDatabase.getDatabase(this) }
    val repository by lazy { UserRepository(database.userDao()) }
    val post by lazy { PostRepository(database.postDao()) }
}
