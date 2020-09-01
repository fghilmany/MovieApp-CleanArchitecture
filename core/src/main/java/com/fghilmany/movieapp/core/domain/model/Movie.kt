package com.fghilmany.movieapp.core.domain.model

data class Movie(
    var id: Int = 0,

    var posterPath: String = "",

    var title: String = "",

    var voteAverage: Float = 0f,

    var release_date: String = "",

    var backdropPath: String = "",

    var overview: String = "",

    var status: String = "",

    var favorite: Boolean = false
)