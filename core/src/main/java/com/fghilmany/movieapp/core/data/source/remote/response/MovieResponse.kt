package com.fghilmany.movieapp.core.data.source.remote.response

import com.google.gson.annotations.SerializedName

data class MovieResponse(
    @field:SerializedName("id")
    var id: Int = 0,
    @field:SerializedName("poster_path")
    var posterPath: String = "",
    @field:SerializedName("title")
    var title: String = "",
    @field:SerializedName("vote_average")
    var voteAverage: Float = 0f,
    @field:SerializedName("release_date")
    var release_date: String = ""
)