package com.fghilmany.movieapp.core.ui

import android.annotation.SuppressLint
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.fghilmany.movieapp.core.R
import com.fghilmany.movieapp.core.domain.model.TvSeries
import kotlinx.android.synthetic.main.item_movie_tv.view.*

class FavoriteTvSeriesAdapter(private val listener: (TvSeries) -> (Unit)) : RecyclerView.Adapter<FavoriteTvSeriesAdapter.TvViewHolder>(){
    private var listMovie = ArrayList<TvSeries>()

    fun setMovies(movies: List<TvSeries>?){
        if (movies == null) return
        listMovie.clear()
        listMovie.addAll(movies)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): TvViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_movie_tv, parent, false)
        return TvViewHolder(
            view
        )
    }

    override fun getItemCount(): Int = listMovie.size

    override fun onBindViewHolder(holder: TvViewHolder, position: Int) {
        val movies = listMovie[position]
        holder.bind(movies, listener)
    }

    class TvViewHolder(view: View): RecyclerView.ViewHolder(view) {
        @SuppressLint("SetTextI18n")
        fun bind (movie: TvSeries, listener: (TvSeries) -> Unit){
            with(itemView){
                tv_list_title.text = movie.name
                tv_rating.text = movie.voteAverage.toString()
                rating_bar.rating = (movie.voteAverage/2)
                tv_date.text ="First air date: " + movie.first_air_date
                setOnClickListener {
                    listener(movie)
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