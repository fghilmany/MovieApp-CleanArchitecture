package com.fghilmany.movieapp.core.data.source.remote.response

import com.google.gson.annotations.SerializedName

data class ListTvSeriesResponse(
    @SerializedName("results")
    var results: List<TvSeriesResponse> = listOf()
)