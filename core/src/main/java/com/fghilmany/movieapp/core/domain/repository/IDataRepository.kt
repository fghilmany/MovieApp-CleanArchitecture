package com.fghilmany.movieapp.core.domain.repository

import com.fghilmany.movieapp.core.data.Resource
import com.fghilmany.movieapp.core.domain.model.Movie
import com.fghilmany.movieapp.core.domain.model.TvSeries
import kotlinx.coroutines.flow.Flow

interface IDataRepository {

    fun getListMovie(): Flow<Resource<List<Movie>>>

    fun getListTv(): Flow<Resource<List<TvSeries>>>

    fun getDetailTv(idTv: String): Flow<Resource<TvSeries>>

    fun getDetailMovie(idMovie: String): Flow<Resource<Movie>>

    fun getFavoriteMovie(): Flow<List<Movie>>

    fun getFavoriteTvSeries(): Flow<List<TvSeries>>

    fun setMovieFavorite(movie: Movie, state: Boolean)

    fun setTvSeriesFavorite(tvSeries: TvSeries, state: Boolean)
}