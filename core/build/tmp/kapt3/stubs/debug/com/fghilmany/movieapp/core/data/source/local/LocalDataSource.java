package com.fghilmany.movieapp.core.data.source.local;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u0006J\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\f\u001a\u00020\rJ\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\u0006\u0010\u000f\u001a\u00020\rJ\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u0006J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u0016\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001fJ\u0016\u0010 \u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006!"}, d2 = {"Lcom/fghilmany/movieapp/core/data/source/local/LocalDataSource;", "", "mMovieTvDao", "Lcom/fghilmany/movieapp/core/data/source/local/room/MovieTvDao;", "(Lcom/fghilmany/movieapp/core/data/source/local/room/MovieTvDao;)V", "getAllMovies", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/fghilmany/movieapp/core/data/source/local/entity/MovieEntity;", "getAllTvSeries", "Lcom/fghilmany/movieapp/core/data/source/local/entity/TvSeriesEntity;", "getDetailMovie", "idMove", "", "getDetailTvSeries", "idTv", "getFavoriteMovies", "getFavoriteTvSeries", "insertDetailMovie", "", "movies", "(Lcom/fghilmany/movieapp/core/data/source/local/entity/MovieEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertDetailTv", "tvSeries", "(Lcom/fghilmany/movieapp/core/data/source/local/entity/TvSeriesEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertMovie", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertTvSeries", "setMovieFavorite", "movie", "newState", "", "setTvFavorite", "core_debug"})
public final class LocalDataSource {
    private final com.fghilmany.movieapp.core.data.source.local.room.MovieTvDao mMovieTvDao = null;
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.fghilmany.movieapp.core.data.source.local.entity.MovieEntity>> getAllMovies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.fghilmany.movieapp.core.data.source.local.entity.TvSeriesEntity>> getAllTvSeries() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.fghilmany.movieapp.core.data.source.local.entity.MovieEntity>> getFavoriteMovies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.fghilmany.movieapp.core.data.source.local.entity.TvSeriesEntity>> getFavoriteTvSeries() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.fghilmany.movieapp.core.data.source.local.entity.MovieEntity> getDetailMovie(@org.jetbrains.annotations.NotNull()
    java.lang.String idMove) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.fghilmany.movieapp.core.data.source.local.entity.TvSeriesEntity> getDetailTvSeries(@org.jetbrains.annotations.NotNull()
    java.lang.String idTv) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertMovie(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fghilmany.movieapp.core.data.source.local.entity.MovieEntity> movies, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertTvSeries(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fghilmany.movieapp.core.data.source.local.entity.TvSeriesEntity> tvSeries, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertDetailMovie(@org.jetbrains.annotations.NotNull()
    com.fghilmany.movieapp.core.data.source.local.entity.MovieEntity movies, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertDetailTv(@org.jetbrains.annotations.NotNull()
    com.fghilmany.movieapp.core.data.source.local.entity.TvSeriesEntity tvSeries, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    public final void setMovieFavorite(@org.jetbrains.annotations.NotNull()
    com.fghilmany.movieapp.core.data.source.local.entity.MovieEntity movie, boolean newState) {
    }
    
    public final void setTvFavorite(@org.jetbrains.annotations.NotNull()
    com.fghilmany.movieapp.core.data.source.local.entity.TvSeriesEntity tvSeries, boolean newState) {
    }
    
    public LocalDataSource(@org.jetbrains.annotations.NotNull()
    com.fghilmany.movieapp.core.data.source.local.room.MovieTvDao mMovieTvDao) {
        super();
    }
}