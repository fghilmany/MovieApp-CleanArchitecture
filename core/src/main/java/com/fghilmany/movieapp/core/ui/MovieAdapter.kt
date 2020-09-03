package com.fghilmany.movieapp.core.ui

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.fghilmany.movieapp.core.R
import com.fghilmany.movieapp.core.domain.model.Movie
import kotlinx.android.synthetic.main.item_movie_tv.view.*
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

class MovieAdapter(private val listener: (Movie) -> (Unit)) :
    RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {
    private var listMovie = ArrayList<Movie>()

    fun setMovies(movies: List<Movie>?) {
        if (movies == null) return
        listMovie.clear()
        listMovie.addAll(movies)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MovieViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_movie_tv, parent, false)
        return MovieViewHolder(view)
    }

    override fun getItemCount(): Int = listMovie.size

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movies = listMovie[position]
        holder.bind(movies, listener)
    }

    class MovieViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        @SuppressLint("SetTextI18n")
        fun bind(movie: Movie, listener: (Movie) -> Unit) {
            with(itemView) {
                tv_list_title.text = movie.title
                tv_rating.text = movie.voteAverage.toString()
                rating_bar.rating = movie.voteAverage / 2
                tv_date.text = "Realease date: " + getDateConvrter(movie.release_date)
                setOnClickListener {
                    listener(movie)
                }
                Glide.with(context)
                    .load("https://image.tmdb.org/t/p/w780" + movie.posterPath)
                    .apply(
                        RequestOptions.placeholderOf(R.drawable.ic_loading)
                            .error(R.drawable.ic_error)
                    )
                    .into(iv_list)
            }
        }

        @SuppressLint("SimpleDateFormat")
        private fun getDateConvrter(tgl: String?): String? {
            val inputFormat: DateFormat = SimpleDateFormat("yyyy-MM-dd")
            val outputFormat: DateFormat = SimpleDateFormat("dd MMM yyyy")
            val date: Date? = inputFormat.parse(tgl.toString())
            return outputFormat.format(date!!)
        }

    }

}