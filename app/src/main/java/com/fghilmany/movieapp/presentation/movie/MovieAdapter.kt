package com.fghilmany.movieapp.presentation.movie

import android.annotation.SuppressLint
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.fghilmany.movieapp.R
import com.fghilmany.movieapp.core.data.source.local.entity.MovieEntity
import com.fghilmany.movieapp.core.domain.model.Movie
import com.fghilmany.movieapp.presentation.detail.DetailActivity
import kotlinx.android.synthetic.main.item_movie_tv.view.*

class MovieAdapter : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>(){
    private var listMovie = ArrayList<Movie>()

    fun setMovies(movies: List<Movie>?){
        if (movies == null) return
        listMovie.clear()
        listMovie.addAll(movies)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MovieViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_movie_tv, parent, false)
        return MovieViewHolder(view)
    }

    override fun getItemCount(): Int = listMovie.size

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movies = listMovie[position]
        holder.bind(movies)
    }

    class MovieViewHolder(view: View): RecyclerView.ViewHolder(view) {
        @SuppressLint("SetTextI18n")
        fun bind (movie: Movie){
            with(itemView){
                tv_list_title.text = movie.title
                tv_rating.text = movie.voteAverage.toString()
                rating_bar.rating = movie.voteAverage/2
                tv_date.text = "Realease date: " + movie.release_date
                setOnClickListener {
                    val i = Intent(itemView.context, DetailActivity::class.java)
                    i.putExtra(DetailActivity.EXTRA_ID_MOVIE, movie.id.toString())
                    itemView.context.startActivity(i)
                }
                Glide.with(context)
                    .load("https://image.tmdb.org/t/p/w780"+movie.posterPath)
                    .apply(RequestOptions.placeholderOf(R.drawable.ic_loading)
                        .error(R.drawable.ic_error))
                    .into(iv_list)
            }
        }

    }

}