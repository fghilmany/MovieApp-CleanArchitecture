package com.fghilmany.movieapp.presentation.tvseries

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.fghilmany.movieapp.core.data.Resource
import com.fghilmany.movieapp.core.domain.model.TvSeries
import com.fghilmany.movieapp.core.domain.usecase.DataUseCase

class TvSeriesViewModel(private val dataUseCase: DataUseCase) : ViewModel() {
    fun getMovies(): LiveData<Resource<List<TvSeries>>> = dataUseCase.getListTv().asLiveData()
}