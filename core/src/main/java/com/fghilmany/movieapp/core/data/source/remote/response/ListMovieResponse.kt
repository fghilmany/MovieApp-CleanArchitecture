package com.fghilmany.movieapp.core.data.source.remote.response

import com.google.gson.annotations.SerializedName

data class ListMovieResponse(
    @field:SerializedName("results")
    var results: List<MovieResponse>
)