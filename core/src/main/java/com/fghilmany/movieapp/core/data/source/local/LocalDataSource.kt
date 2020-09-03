package com.fghilmany.movieapp.core.data.source.local

import com.fghilmany.movieapp.core.data.source.local.entity.MovieEntity
import com.fghilmany.movieapp.core.data.source.local.entity.TvSeriesEntity
import com.fghilmany.movieapp.core.data.source.local.room.MovieTvDao
import kotlinx.coroutines.flow.Flow

class LocalDataSource(private val mMovieTvDao: MovieTvDao) {


    fun getAllMovies(): Flow<List<MovieEntity>> = mMovieTvDao.getMovie()

    fun getAllTvSeries(): Flow<List<TvSeriesEntity>> = mMovieTvDao.getTvSeries()

    fun getFavoriteMovies(): Flow<List<MovieEntity>> = mMovieTvDao.getFavoriteMovie()

    fun getFavoriteTvSeries(): Flow<List<TvSeriesEntity>> = mMovieTvDao.getFavoriteTvSeries()

    fun getDetailMovie(idMove: String): Flow<MovieEntity> = mMovieTvDao.getDetailMovie(idMove)

    fun getDetailTvSeries(idTv: String): Flow<TvSeriesEntity> = mMovieTvDao.getDetailTvSeries(idTv)

    suspend fun insertMovie(movies: List<MovieEntity>) = mMovieTvDao.insertMovies(movies)

    suspend fun insertTvSeries(tvSeries: List<TvSeriesEntity>) =
        mMovieTvDao.insertTvSeries(tvSeries)

    suspend fun insertDetailMovie(movies: MovieEntity) = mMovieTvDao.insertDetailMovie(movies)

    suspend fun insertDetailTv(tvSeries: TvSeriesEntity) = mMovieTvDao.insertDetailTv(tvSeries)

    fun setMovieFavorite(movie: MovieEntity, newState: Boolean) {
        movie.favorite = newState
        mMovieTvDao.updateFavoriteMovie(movie)
    }

    fun setTvFavorite(tvSeries: TvSeriesEntity, newState: Boolean) {
        tvSeries.favorite = newState
        mMovieTvDao.updateFavoriteTvSeries(tvSeries)
    }
}