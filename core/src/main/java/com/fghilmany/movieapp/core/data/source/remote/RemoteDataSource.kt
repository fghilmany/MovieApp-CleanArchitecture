package com.fghilmany.movieapp.core.data.source.remote

import android.util.Log
import com.fghilmany.movieapp.core.BuildConfig
import com.fghilmany.movieapp.core.data.source.remote.network.ApiResponse
import com.fghilmany.movieapp.core.data.source.remote.network.ApiService
import com.fghilmany.movieapp.core.data.source.remote.response.DetailMovieResponse
import com.fghilmany.movieapp.core.data.source.remote.response.DetailTvSeriesResponse
import com.fghilmany.movieapp.core.data.source.remote.response.MovieResponse
import com.fghilmany.movieapp.core.data.source.remote.response.TvSeriesResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

class RemoteDataSource(private val apiService: ApiService?) {

    suspend fun getListMovie(): Flow<ApiResponse<List<MovieResponse>>> {

        return flow {
            try {
                val response = apiService?.getMovieData(BuildConfig.TMDB_API_KEY)
                val dataArray = response?.results
                if (dataArray != null) {
                    if (dataArray.isNotEmpty()) {
                        emit(ApiResponse.Success(response.results))
                    } else {
                        emit(ApiResponse.Empty)
                    }
                }
            } catch (e: Exception) {
                emit(ApiResponse.Error(e.toString()))
                Log.e("RemoteDataSource", e.toString())
            }
        }.flowOn(Dispatchers.IO)
    }

    suspend fun getListTv(): Flow<ApiResponse<List<TvSeriesResponse>>> {
        return flow {
            try {
                val response = apiService?.getTvData(BuildConfig.TMDB_API_KEY)
                val dataArray = response?.results
                if (dataArray != null) {
                    if (dataArray.isNotEmpty()) {
                        emit(ApiResponse.Success(response.results))
                    } else {
                        emit(ApiResponse.Empty)
                    }
                }
            } catch (e: Exception) {
                emit(ApiResponse.Error(e.toString()))
                Log.e("RemoteDataSource", e.toString())
            }
        }.flowOn(Dispatchers.IO)
    }

    suspend fun getDetailMovie(idMovie: String): Flow<ApiResponse<DetailMovieResponse>> {
        return flow {
            try {
                val response = apiService?.getDetailMovie(idMovie, BuildConfig.TMDB_API_KEY)
                if (response != null) {
                    emit(ApiResponse.Success(response))
                } else {
                    emit(ApiResponse.Empty)
                }

            } catch (e: Exception) {
                emit(ApiResponse.Error(e.toString()))
                Log.e("RemoteDataSource", e.toString())
            }
        }.flowOn(Dispatchers.IO)
    }

    suspend fun getDetailTv(idTv: String): Flow<ApiResponse<DetailTvSeriesResponse>> {
        return flow {
            try {
                val response = apiService?.getDetailTv(idTv, BuildConfig.TMDB_API_KEY)
                if (response != null) {
                    emit(ApiResponse.Success(response))
                } else {
                    emit(ApiResponse.Empty)
                }
            } catch (e: Exception) {
                emit(ApiResponse.Error(e.toString()))
                Log.e("RemoteDataSource", e.toString())
            }
        }.flowOn(Dispatchers.IO)
    }


}