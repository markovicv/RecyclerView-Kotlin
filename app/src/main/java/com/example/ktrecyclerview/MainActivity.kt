package com.example.ktrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ktrecyclerview.db.Data
import com.example.ktrecyclerview.model.Post
import com.example.ktrecyclerview.recyclerView.PostRecyclerAdapter
import com.example.ktrecyclerview.recyclerView.SpacingDecorator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var postAdapter:PostRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        createRecyclerView()
        addData()
    }


    private fun createRecyclerView(){
        recyclerViewId.layoutManager = LinearLayoutManager(this)
        val spacingDecoration = SpacingDecorator(30)
        recyclerViewId.addItemDecoration(spacingDecoration) 
        postAdapter = PostRecyclerAdapter()
        recyclerViewId.adapter = postAdapter


    }
    private fun addData(){
        val data:List<Post> = Data.getData()
        postAdapter.createList(data)
    }
}
