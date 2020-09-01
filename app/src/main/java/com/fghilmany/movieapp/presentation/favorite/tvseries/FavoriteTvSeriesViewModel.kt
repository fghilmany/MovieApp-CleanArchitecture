package com.fghilmany.movieapp.presentation.favorite.tvseries

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.fghilmany.movieapp.core.data.DataRepository
import com.fghilmany.movieapp.core.data.source.local.entity.TvSeriesEntity
import com.fghilmany.movieapp.core.domain.model.TvSeries
import com.fghilmany.movieapp.core.domain.usecase.DataUseCase

class FavoriteTvSeriesViewModel(private val dataUseCase: DataUseCase) : ViewModel() {
    fun getMovies(): LiveData<List<TvSeries>> = dataUseCase.getFavoriteTvSeries().asLiveData()
}