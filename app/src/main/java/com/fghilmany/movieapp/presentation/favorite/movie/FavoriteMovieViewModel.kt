package com.fghilmany.movieapp.presentation.favorite.movie

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.fghilmany.movieapp.core.domain.model.Movie
import com.fghilmany.movieapp.core.domain.usecase.DataUseCase

class FavoriteMovieViewModel(private val dataUseCase: DataUseCase) : ViewModel() {
    fun getMovies(): LiveData<List<Movie>> = dataUseCase.getFavoriteMovie().asLiveData()
}