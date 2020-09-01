package com.fghilmany.movieapp.core.domain.usecase

import com.fghilmany.movieapp.core.domain.model.Movie
import com.fghilmany.movieapp.core.domain.model.TvSeries
import com.fghilmany.movieapp.core.domain.repository.IDataRepository

class DataInteractor(private val dataRepository: IDataRepository) :
    DataUseCase {
    override fun getListMovie() = dataRepository.getListMovie()

    override fun getListTv() = dataRepository.getListTv()

    override fun getDetailTv(idTv: String) = dataRepository.getDetailTv(idTv)

    override fun getDetailMovie(idMovie: String) = dataRepository.getDetailMovie(idMovie)

    override fun getFavoriteMovie() = dataRepository.getFavoriteMovie()

    override fun getFavoriteTvSeries() = dataRepository.getFavoriteTvSeries()

    override fun setMovieFavorite(movie: Movie, state: Boolean) = dataRepository.setMovieFavorite(movie, state)

    override fun setTvSeriesFavorite(tvSeries: TvSeries, state: Boolean) = dataRepository.setTvSeriesFavorite(tvSeries, state)

}
