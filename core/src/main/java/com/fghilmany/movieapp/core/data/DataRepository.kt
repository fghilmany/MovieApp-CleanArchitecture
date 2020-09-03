package com.fghilmany.movieapp.core.data

import com.fghilmany.movieapp.core.data.source.local.LocalDataSource
import com.fghilmany.movieapp.core.data.source.remote.RemoteDataSource
import com.fghilmany.movieapp.core.data.source.remote.network.ApiResponse
import com.fghilmany.movieapp.core.data.source.remote.response.DetailMovieResponse
import com.fghilmany.movieapp.core.data.source.remote.response.DetailTvSeriesResponse
import com.fghilmany.movieapp.core.data.source.remote.response.MovieResponse
import com.fghilmany.movieapp.core.data.source.remote.response.TvSeriesResponse
import com.fghilmany.movieapp.core.domain.model.Movie
import com.fghilmany.movieapp.core.domain.model.TvSeries
import com.fghilmany.movieapp.core.domain.repository.IDataRepository
import com.fghilmany.movieapp.core.utils.AppExecutors
import com.fghilmany.movieapp.core.utils.DataMapper
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class DataRepository(
    private val remoteDataSource: RemoteDataSource,
    private val localDataSource: LocalDataSource,
    private val appExecutors: AppExecutors
) : IDataRepository {

    override fun getListMovie(): Flow<Resource<List<Movie>>> {
        return object : NetworkBoundResource<List<Movie>, List<MovieResponse>>() {
            override fun loadFromDB(): Flow<List<Movie>> {
                return localDataSource.getAllMovies()
                    .map { DataMapper.movieMapEntitiesToDomain(it) }
            }


            override fun shouldFetch(data: List<Movie>?): Boolean =
                data == null || data.isEmpty()


            override suspend fun createCall(): Flow<ApiResponse<List<MovieResponse>>> =
                remoteDataSource.getListMovie()


            override suspend fun saveCallResult(data: List<MovieResponse>) {
                val movieLlist = DataMapper.movieMapResponseToEntities(data)
                localDataSource.insertMovie(movieLlist)
            }

        }.asFlow()


    }

    override fun getListTv(): Flow<Resource<List<TvSeries>>> {
        return object :
            NetworkBoundResource<List<TvSeries>, List<TvSeriesResponse>>() {
            override fun loadFromDB(): Flow<List<TvSeries>> {
                return localDataSource.getAllTvSeries()
                    .map { DataMapper.tvSeriesMapEntitiesToDomain(it) }
            }

            override fun shouldFetch(data: List<TvSeries>?): Boolean =
                data == null || data.isEmpty()


            override suspend fun createCall(): Flow<ApiResponse<List<TvSeriesResponse>>> =
                remoteDataSource.getListTv()


            override suspend fun saveCallResult(data: List<TvSeriesResponse>) {
                val tvList = DataMapper.tvSeriesMapResponseToEntities(data)
                localDataSource.insertTvSeries(tvList)
            }

        }.asFlow()

    }

    override fun getDetailTv(idTv: String): Flow<Resource<TvSeries>> {
        return object : NetworkBoundResource<TvSeries, DetailTvSeriesResponse>() {
            override fun loadFromDB(): Flow<TvSeries> {
                return localDataSource.getDetailTvSeries(idTv)
                    .map { DataMapper.tvSeriesMapEntityToDomain(it) }
            }


            override fun shouldFetch(data: TvSeries?): Boolean =
                data?.overview == "" || data == null


            override suspend fun createCall(): Flow<ApiResponse<DetailTvSeriesResponse>> =
                remoteDataSource.getDetailTv(idTv)


            override suspend fun saveCallResult(data: DetailTvSeriesResponse) {
                val tvDetail = DataMapper.tvSeriesDetailResponseToEntity(data)
                localDataSource.insertDetailTv(tvDetail)
            }

        }.asFlow()
    }

    override fun getDetailMovie(idMovie: String): Flow<Resource<Movie>> {
        return object : NetworkBoundResource<Movie, DetailMovieResponse>() {
            override fun loadFromDB(): Flow<Movie> {
                return localDataSource.getDetailMovie(idMovie)
                    .map { DataMapper.movieMapEntityToDomain(it) }
            }


            override fun shouldFetch(data: Movie?): Boolean =
                data?.overview == "" || data == null


            override suspend fun createCall(): Flow<ApiResponse<DetailMovieResponse>> =
                remoteDataSource.getDetailMovie(idMovie)


            override suspend fun saveCallResult(data: DetailMovieResponse) {
                val movieDetail = DataMapper.movieDetailResponseToEntity(data)
                localDataSource.insertDetailMovie(movieDetail)
            }

        }.asFlow()
    }


    override fun getFavoriteMovie(): Flow<List<Movie>> {
        return localDataSource.getFavoriteMovies().map { DataMapper.movieMapEntitiesToDomain(it) }
    }

    override fun getFavoriteTvSeries(): Flow<List<TvSeries>> {
        return localDataSource.getFavoriteTvSeries()
            .map { DataMapper.tvSeriesMapEntitiesToDomain(it) }
    }

    override fun setMovieFavorite(movie: Movie, state: Boolean) {
        val movieEntity = DataMapper.movieMapDomainToEntity(movie)
        appExecutors.diskIO().execute { localDataSource.setMovieFavorite(movieEntity, state) }
    }

    override fun setTvSeriesFavorite(tvSeries: TvSeries, state: Boolean) {
        val tvSeriesEntity = DataMapper.tvSeriesMapDomainToEntity(tvSeries)
        appExecutors.diskIO().execute { localDataSource.setTvFavorite(tvSeriesEntity, state) }
    }


}