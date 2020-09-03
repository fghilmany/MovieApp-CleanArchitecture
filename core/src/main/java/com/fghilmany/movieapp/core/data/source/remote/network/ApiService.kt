package com.fghilmany.movieapp.core.data.source.remote.network

import com.fghilmany.movieapp.core.data.source.remote.response.DetailMovieResponse
import com.fghilmany.movieapp.core.data.source.remote.response.DetailTvSeriesResponse
import com.fghilmany.movieapp.core.data.source.remote.response.ListMovieResponse
import com.fghilmany.movieapp.core.data.source.remote.response.ListTvSeriesResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {

    @GET("movie/{movieId}")
    suspend fun getDetailMovie(
        @Path("movieId") movieId: String,
        @Query("api_key") apiKey: String
    ): DetailMovieResponse

    @GET("movie/popular")
    suspend fun getMovieData(
        @Query("api_key") apiKey: String
    ): ListMovieResponse

    @GET("tv/{tv_id}")
    suspend fun getDetailTv(
        @Path("tv_id") tvId: String,
        @Query("api_key") apiKey: String
    ): DetailTvSeriesResponse

    @GET("tv/popular")
    suspend fun getTvData(
        @Query("api_key") apiKey: String
    ): ListTvSeriesResponse

}