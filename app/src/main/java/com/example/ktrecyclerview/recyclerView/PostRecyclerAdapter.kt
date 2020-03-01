package com.example.ktrecyclerview.recyclerView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.ktrecyclerview.R
import com.example.ktrecyclerview.model.Post
import kotlinx.android.synthetic.main.post_item_list.view.*

class PostRecyclerAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    private var items:List<Post> = ArrayList<Post>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        return PostViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.post_item_list,parent,false))
    }

    override fun getItemCount(): Int {

        return items.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder){
            is PostViewHolder ->{
                holder.bind(items.get(position))
            }
        }

    }
    fun createList(postList:List<Post>){
        this.items = postList
    }


    class PostViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val post_image_view:ImageView = itemView.imageId
        val title_view:TextView = itemView.titleId
        val author_view:TextView = itemView.authorId

        fun bind(post:Post){
            title_view.setText(post.title)
            author_view.setText(post.userName)

            val requestOptions = RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)

            Glide.with(itemView.context)
                .applyDefaultRequestOptions(requestOptions)
                .load(post.image)
                .into(post_image_view)

        }
    }
}