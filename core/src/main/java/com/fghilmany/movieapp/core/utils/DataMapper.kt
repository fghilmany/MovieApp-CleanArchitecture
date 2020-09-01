package com.fghilmany.movieapp.core.utils

import com.fghilmany.movieapp.core.data.source.local.entity.MovieEntity
import com.fghilmany.movieapp.core.data.source.local.entity.TvSeriesEntity
import com.fghilmany.movieapp.core.data.source.remote.response.*
import com.fghilmany.movieapp.core.domain.model.Movie
import com.fghilmany.movieapp.core.domain.model.TvSeries

object DataMapper {

    fun movieMapResponseToEntities(input: List<MovieResponse>): List<MovieEntity> {
        val movieList = ArrayList<MovieEntity>()
        input.map{
            val movie = MovieEntity(
                id = it.id,
                posterPath = it.posterPath,
                title = it.title,
                voteAverage = it.voteAverage,
                release_date = it.release_date,
                favorite = false
            )
            movieList.add(movie)
        }
        return movieList
    }

    fun tvSeriesMapResponseToEntities(input: List<TvSeriesResponse>): List<TvSeriesEntity> {
        val tvList = ArrayList<TvSeriesEntity>()
        input.map{
            val tvSeries = TvSeriesEntity(
                id = it.id,
                name = it.name,
                posterPath = it.posterPath,
                voteAverage = it.voteAverage,
                first_air_date = it.first_air_date,
                favorite = false
            )
            tvList.add(tvSeries)
        }
        return tvList
    }

    fun movieMapEntitiesToDomain(input: List<MovieEntity>): List<Movie> =
        input.map {
            Movie(
                id = it.id,
                posterPath = it.posterPath,
                title = it.title,
                voteAverage = it.voteAverage,
                release_date = it.release_date,
                backdropPath = it.backdropPath,
                overview = it.overview,
                status = it.status,
                favorite = it.favorite
            )
        }

    fun tvSeriesMapEntitiesToDomain(input: List<TvSeriesEntity>): List<TvSeries> =
    input.map {
        TvSeries(
            id = it.id,
            name = it.name,
            posterPath = it.posterPath,
            voteAverage = it.voteAverage,
            first_air_date = it.first_air_date,
            backdropPath = it.backdropPath,
            overview = it.overview,
            status = it.status,
            number_of_seasons = it.number_of_seasons,
            favorite = it.favorite
        )
    }

    fun movieMapDomainToEntity(input: Movie) = MovieEntity(
        id = input.id,
        posterPath = input.posterPath,
        title = input.title,
        voteAverage = input.voteAverage,
        release_date = input.release_date,
        backdropPath = input.backdropPath,
        overview = input.overview,
        status = input.status,
        favorite = input.favorite
    )

    fun tvSeriesMapDomainToEntity(input: TvSeries) = TvSeriesEntity(
        id = input.id,
        name = input.name,
        posterPath = input.posterPath,
        voteAverage = input.voteAverage,
        first_air_date = input.first_air_date,
        backdropPath = input.backdropPath,
        overview = input.overview,
        status = input.status,
        number_of_seasons = input.number_of_seasons,
        favorite = input.favorite
    )

    fun movieMapEntityToDomain(input : MovieEntity) = Movie(
        id = input.id,
        posterPath = input.posterPath,
        title = input.title,
        voteAverage = input.voteAverage,
        release_date = input.release_date,
        backdropPath = input.backdropPath,
        overview = input.overview,
        status = input.status,
        favorite = input.favorite
    )

    fun tvSeriesMapEntityToDomain(input : TvSeriesEntity) = TvSeries(
        id = input.id,
        name = input.name,
        posterPath = input.posterPath,
        voteAverage = input.voteAverage,
        first_air_date = input.first_air_date,
        backdropPath = input.backdropPath,
        overview = input.overview,
        status = input.status,
        number_of_seasons= input.number_of_seasons,
        favorite = input.favorite
    )

    fun movieDetailResponseToEntity(input: DetailMovieResponse) = MovieEntity(
        input.id,
        input.posterPath,
        input.title,
        input.voteAverage,
        input.release_date,
        input.backdropPath,
        input.overview,
        input.status,
        false
    )

    fun tvSeriesDetailResponseToEntity(input: DetailTvSeriesResponse) = TvSeriesEntity(
        input.id,
        input.name,
        input.posterPath,
        input.voteAverage,
        input.first_air_date,
        input.backdropPath,
        input.overview,
        input.status,
        input.number_of_seasons,
        false
    )

}