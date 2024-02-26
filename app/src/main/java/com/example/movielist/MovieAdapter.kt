package com.example.movielist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MovieAdapter(private val movies : List<Movie>): RecyclerView.Adapter<MovieAdapter.ViewHolderClass>() {

    class ViewHolderClass(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name: TextView = itemView.findViewById(R.id.movie_name)
        val director: TextView = itemView.findViewById(R.id.movie_director)
        var img: ImageView = itemView.findViewById(R.id.movie_img)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderClass {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.movie_item, parent, false)
        return ViewHolderClass(view)
    }

    override fun onBindViewHolder(holder: ViewHolderClass, position: Int) {
        val movie = movies[position]
        holder.name.text = movie.name
        holder.director.text = movie.director
        holder.img.setImageResource(movie.image)
    }

    override fun getItemCount(): Int {
        return movies.size
    }
}
