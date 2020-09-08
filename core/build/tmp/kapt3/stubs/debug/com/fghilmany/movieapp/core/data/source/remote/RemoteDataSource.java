package com.fghilmany.movieapp.core.data.source.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ%\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00070\u00062\u0006\u0010\u000e\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ#\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u00070\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J#\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00100\u00070\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcom/fghilmany/movieapp/core/data/source/remote/RemoteDataSource;", "", "apiService", "Lcom/fghilmany/movieapp/core/data/source/remote/network/ApiService;", "(Lcom/fghilmany/movieapp/core/data/source/remote/network/ApiService;)V", "getDetailMovie", "Lkotlinx/coroutines/flow/Flow;", "Lcom/fghilmany/movieapp/core/data/source/remote/network/ApiResponse;", "Lcom/fghilmany/movieapp/core/data/source/remote/response/DetailMovieResponse;", "idMovie", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDetailTv", "Lcom/fghilmany/movieapp/core/data/source/remote/response/DetailTvSeriesResponse;", "idTv", "getListMovie", "", "Lcom/fghilmany/movieapp/core/data/source/remote/response/MovieResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getListTv", "Lcom/fghilmany/movieapp/core/data/source/remote/response/TvSeriesResponse;", "core_debug"})
public final class RemoteDataSource {
    private final com.fghilmany.movieapp.core.data.source.remote.network.ApiService apiService = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getListMovie(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.fghilmany.movieapp.core.data.source.remote.network.ApiResponse<? extends java.util.List<com.fghilmany.movieapp.core.data.source.remote.response.MovieResponse>>>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getListTv(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.fghilmany.movieapp.core.data.source.remote.network.ApiResponse<? extends java.util.List<com.fghilmany.movieapp.core.data.source.remote.response.TvSeriesResponse>>>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getDetailMovie(@org.jetbrains.annotations.NotNull()
    java.lang.String idMovie, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.fghilmany.movieapp.core.data.source.remote.network.ApiResponse<com.fghilmany.movieapp.core.data.source.remote.response.DetailMovieResponse>>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getDetailTv(@org.jetbrains.annotations.NotNull()
    java.lang.String idTv, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.fghilmany.movieapp.core.data.source.remote.network.ApiResponse<com.fghilmany.movieapp.core.data.source.remote.response.DetailTvSeriesResponse>>> p1) {
        return null;
    }
    
    public RemoteDataSource(@org.jetbrains.annotations.Nullable()
    com.fghilmany.movieapp.core.data.source.remote.network.ApiService apiService) {
        super();
    }
}