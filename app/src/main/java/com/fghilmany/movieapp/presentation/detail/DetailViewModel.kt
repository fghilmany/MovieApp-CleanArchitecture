package com.fghilmany.movieapp.presentation.detail

import androidx.lifecycle.*
import com.fghilmany.movieapp.core.data.Resource
import com.fghilmany.movieapp.core.domain.model.Movie
import com.fghilmany.movieapp.core.domain.model.TvSeries
import com.fghilmany.movieapp.core.domain.usecase.DataUseCase

class DetailViewModel(private val dataUseCase: DataUseCase) : ViewModel() {

    var idMovie  = MutableLiveData<String>()
    var idTvSeries  = MutableLiveData<String>()

    fun selectedMovie(idMovie:String){
        this.idMovie.value = idMovie
    }

    fun selectedTvSeries(idTvSeries: String){
        this.idTvSeries.value = idTvSeries
    }

    var getDetailMovie : LiveData<Resource<Movie>>? = Transformations.switchMap(idMovie){ idMovie ->
        dataUseCase.getDetailMovie(idMovie).asLiveData()
    }

    var getDetailTvSeries : LiveData<Resource<TvSeries>> = Transformations.switchMap(idTvSeries){ idTvSeries ->
        dataUseCase.getDetailTv(idTvSeries).asLiveData()
    }


    fun setFavoriteMovie() {
        val movieResource = getDetailMovie?.value
        if (movieResource != null){
            val movie = movieResource.data
            if (movie != null){
                val newState = !movie.favorite
                dataUseCase.setMovieFavorite(movie, newState)
            }
        }
    }

    fun setFavoriteTvSeries() {
        val tvResource = getDetailTvSeries.value
        if (tvResource != null){
            val tvSeries = tvResource.data

            if (tvSeries != null){
                val newState = !tvSeries.favorite
                dataUseCase.setTvSeriesFavorite(tvSeries, newState)
            }
        }
    }
}