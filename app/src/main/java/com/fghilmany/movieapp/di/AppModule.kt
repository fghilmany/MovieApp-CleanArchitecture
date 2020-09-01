package com.fghilmany.movieapp.di

import com.fghilmany.movieapp.core.domain.usecase.DataInteractor
import com.fghilmany.movieapp.core.domain.usecase.DataUseCase
import com.fghilmany.movieapp.presentation.detail.DetailViewModel
import com.fghilmany.movieapp.presentation.favorite.movie.FavoriteMovieViewModel
import com.fghilmany.movieapp.presentation.favorite.tvseries.FavoriteTvSeriesViewModel
import com.fghilmany.movieapp.presentation.movie.MovieViewModel
import com.fghilmany.movieapp.presentation.tvseries.TvSeriesViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val useCaseModule = module {
    factory<DataUseCase> { DataInteractor(get()) }
}

val viewModelModule = module {
    viewModel { MovieViewModel(get()) }
    viewModel { DetailViewModel(get()) }
    viewModel { TvSeriesViewModel(get()) }
    viewModel { FavoriteMovieViewModel(get()) }
    viewModel { FavoriteTvSeriesViewModel(get()) }
}