package com.fghilmany.movieapp.presentation.detail

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.lifecycle.Observer
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.request.RequestOptions.bitmapTransform
import com.fghilmany.movieapp.R
import com.fghilmany.movieapp.core.data.Resource
import com.fghilmany.movieapp.core.domain.model.Movie
import com.fghilmany.movieapp.core.domain.model.TvSeries
import jp.wasabeef.glide.transformations.BlurTransformation
import kotlinx.android.synthetic.main.activity_detail.*
import org.koin.android.viewmodel.ext.android.viewModel

class DetailActivity : AppCompatActivity() {

    private val viewModel: DetailViewModel by viewModel()
    private var state: Boolean = false

    companion object {
        const val EXTRA_ID_MOVIE = "extra_id_movie"
        const val EXTRA_ID_TV = "extra_id_tv"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val extras = intent.extras
        if (extras != null) {
            val idMovie = extras.getString(EXTRA_ID_MOVIE)
            val idTv = extras.getString(EXTRA_ID_TV)
            progress_bar.visibility = View.VISIBLE
            if (idMovie != null) {
                viewModel.selectedMovie(idMovie)
                viewModel.getDetailMovie?.observe(this, Observer { movie ->
                    if (movie != null) {
                        when (movie) {
                            is Resource.Loading -> progress_bar.visibility = View.VISIBLE
                            is Resource.Success -> {
                                progress_bar.visibility = View.GONE
                                populateMovie(movie.data)
                                state = movie.data!!.favorite
                                setFavoriteState(state)


                            }
                            is Resource.Error -> {
                                progress_bar.visibility = View.GONE
                                Toast.makeText(this, "Terjadi kesalahan", Toast.LENGTH_SHORT).show()
                            }

                        }
                    }
                })

                btn_favorite.setOnClickListener {
                    if (state) {
                        viewModel.setFavoriteMovie()
                        btn_favorite.text = resources.getText(R.string.remove_from_favorite)
                        btn_favorite.icon = ContextCompat.getDrawable(this, R.drawable.ic_remove)
                    } else {
                        viewModel.setFavoriteMovie()
                        btn_favorite.text = resources.getText(R.string.add_to_favorite)
                        btn_favorite.icon = ContextCompat.getDrawable(this, R.drawable.ic_add)
                    }
                }
            } else {
                if (idTv != null) {
                    viewModel.selectedTvSeries(idTv)
                    viewModel.getDetailTvSeries.observe(this, Observer { tv ->
                        if (tv != null) {
                            when (tv) {
                                is Resource.Loading -> progress_bar.visibility = View.VISIBLE
                                is Resource.Success -> {
                                    progress_bar.visibility = View.GONE
                                    populateTvSeries(tv.data!!)
                                    state = tv.data!!.favorite
                                    setFavoriteState(state)
                                }
                                is Resource.Error -> {
                                    progress_bar.visibility = View.GONE
                                    Toast.makeText(this, "Terjadi kesalahan", Toast.LENGTH_SHORT)
                                        .show()
                                }

                            }
                        }
                    })
                    btn_favorite.setOnClickListener {
                        if (state) {
                            viewModel.setFavoriteTvSeries()
                            btn_favorite.text = resources.getText(R.string.remove_from_favorite)
                            btn_favorite.icon =
                                ContextCompat.getDrawable(this, R.drawable.ic_remove)
                        } else {
                            viewModel.setFavoriteTvSeries()
                            btn_favorite.text = resources.getText(R.string.add_to_favorite)
                            btn_favorite.icon = ContextCompat.getDrawable(this, R.drawable.ic_add)
                        }
                    }
                }
            }
        }
    }

    private fun setFavoriteState(state: Boolean) {

        if (state) {
            btn_favorite.text = resources.getText(R.string.remove_from_favorite)
            btn_favorite.icon = ContextCompat.getDrawable(this, R.drawable.ic_remove)
        } else {
            btn_favorite.text = resources.getText(R.string.add_to_favorite)
            btn_favorite.icon = ContextCompat.getDrawable(this, R.drawable.ic_add)
        }
    }

    @SuppressLint("SetTextI18n")
    private fun populateMovie(detailMovie: Movie?) {
        tv_title.text = detailMovie?.title
        tv_overview.text = detailMovie?.overview
        tv_seasion.visibility = View.GONE
        tv_status.text = "Status: " + detailMovie?.status
        tv_rating.text = detailMovie?.voteAverage.toString()
        Glide.with(this)
            .load("https://image.tmdb.org/t/p/w780" + detailMovie?.posterPath)
            .apply(
                RequestOptions.placeholderOf(R.drawable.ic_loading)
                    .error(R.drawable.ic_error)
            )
            .centerCrop()
            .into(iv_poster_detail)

        Glide.with(this)
            .load("https://image.tmdb.org/t/p/w780" + detailMovie?.backdropPath)
            .apply(bitmapTransform(BlurTransformation(5, 3)))
            .into(iv_backdrop)
    }

    @SuppressLint("SetTextI18n")
    private fun populateTvSeries(detailTvSeries: TvSeries) {
        tv_title.text = detailTvSeries.name
        tv_overview.text = detailTvSeries.overview
        tv_status.text = "Status: " + detailTvSeries.status
        tv_seasion.text = "Season: " + detailTvSeries.number_of_seasons
        tv_rating.text = detailTvSeries.voteAverage.toString()
        Glide.with(this)
            .load("https://image.tmdb.org/t/p/w780" + detailTvSeries.posterPath)
            .apply(
                RequestOptions.placeholderOf(R.drawable.ic_loading)
                    .error(R.drawable.ic_error)
            )
            .centerCrop()
            .into(iv_poster_detail)

        Glide.with(this)
            .load("https://image.tmdb.org/t/p/w780" + detailTvSeries.backdropPath)
            .apply(bitmapTransform(BlurTransformation(5, 1)))
            .into(iv_backdrop)
    }

}
