package com.fghilmany.movieapp.core.data.source.local.room

import androidx.room.*
import com.fghilmany.movieapp.core.data.source.local.entity.MovieEntity
import com.fghilmany.movieapp.core.data.source.local.entity.TvSeriesEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface MovieTvDao {

    @Query("SELECT * FROM movieentities")
    fun getMovie(): Flow<List<MovieEntity>>

    @Query("SELECT * FROM movieentities where favorite = 1")
    fun getFavoriteMovie(): Flow<List<MovieEntity>>

    @Query("SELECT * FROM tventities")
    fun getTvSeries(): Flow<List<TvSeriesEntity>>

    @Query("SELECT * FROM tventities where favorite = 1")
    fun getFavoriteTvSeries(): Flow<List<TvSeriesEntity>>

    @Query("SELECT * FROM movieentities where id = :movieId")
    fun getDetailMovie(movieId: String): Flow<MovieEntity>

    @Query("SELECT * FROM tventities where id = :tvSeriesId")
    fun getDetailTvSeries(tvSeriesId: String): Flow<TvSeriesEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMovies(movie: List<MovieEntity>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTvSeries(tvSeries: List<TvSeriesEntity>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertDetailMovie(movie: MovieEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertDetailTv(tvSeries: TvSeriesEntity)

    @Update()
    fun updateFavoriteMovie(movie: MovieEntity)

    @Update
    fun updateFavoriteTvSeries(tvSeries: TvSeriesEntity)
}