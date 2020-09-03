package com.fghilmany.movieapp.presentation.movie

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.fghilmany.movieapp.core.data.Resource
import com.fghilmany.movieapp.core.domain.model.Movie
import com.fghilmany.movieapp.core.domain.usecase.DataUseCase

class MovieViewModel(private val dataUseCase: DataUseCase) : ViewModel() {
    fun getMovies(): LiveData<Resource<List<Movie>>> = dataUseCase.getListMovie().asLiveData()
}