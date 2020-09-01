package com.fghilmany.movieapp.core.domain.model

import androidx.room.ColumnInfo

data class TvSeries(
    var id: Int = 0,

    var name: String = "",

    var posterPath: String = "",

    var voteAverage: Float = 0f,

    var first_air_date: String = "",

    var backdropPath: String = "",

    var overview: String = "",

    var status: String = "",

    var number_of_seasons: String = "",

    var favorite: Boolean = false
)