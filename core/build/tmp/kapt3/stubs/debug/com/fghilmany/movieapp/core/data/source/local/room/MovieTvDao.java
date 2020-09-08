package com.fghilmany.movieapp.core.data.source.local.room;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000b\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u0006\u0010\t\u001a\u00020\u0006H\'J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b0\u0003H\'J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000b0\u0003H\'J\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b0\u0003H\'J\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000b0\u0003H\'J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0004H\'J\u0010\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\bH\'\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001b"}, d2 = {"Lcom/fghilmany/movieapp/core/data/source/local/room/MovieTvDao;", "", "getDetailMovie", "Lkotlinx/coroutines/flow/Flow;", "Lcom/fghilmany/movieapp/core/data/source/local/entity/MovieEntity;", "movieId", "", "getDetailTvSeries", "Lcom/fghilmany/movieapp/core/data/source/local/entity/TvSeriesEntity;", "tvSeriesId", "getFavoriteMovie", "", "getFavoriteTvSeries", "getMovie", "getTvSeries", "insertDetailMovie", "", "movie", "(Lcom/fghilmany/movieapp/core/data/source/local/entity/MovieEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertDetailTv", "tvSeries", "(Lcom/fghilmany/movieapp/core/data/source/local/entity/TvSeriesEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertMovies", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertTvSeries", "updateFavoriteMovie", "updateFavoriteTvSeries", "core_debug"})
public abstract interface MovieTvDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM movieentities")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.fghilmany.movieapp.core.data.source.local.entity.MovieEntity>> getMovie();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM movieentities where favorite = 1")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.fghilmany.movieapp.core.data.source.local.entity.MovieEntity>> getFavoriteMovie();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM tventities")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.fghilmany.movieapp.core.data.source.local.entity.TvSeriesEntity>> getTvSeries();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM tventities where favorite = 1")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.fghilmany.movieapp.core.data.source.local.entity.TvSeriesEntity>> getFavoriteTvSeries();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM movieentities where id = :movieId")
    public abstract kotlinx.coroutines.flow.Flow<com.fghilmany.movieapp.core.data.source.local.entity.MovieEntity> getDetailMovie(@org.jetbrains.annotations.NotNull()
    java.lang.String movieId);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM tventities where id = :tvSeriesId")
    public abstract kotlinx.coroutines.flow.Flow<com.fghilmany.movieapp.core.data.source.local.entity.TvSeriesEntity> getDetailTvSeries(@org.jetbrains.annotations.NotNull()
    java.lang.String tvSeriesId);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertMovies(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fghilmany.movieapp.core.data.source.local.entity.MovieEntity> movie, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertTvSeries(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fghilmany.movieapp.core.data.source.local.entity.TvSeriesEntity> tvSeries, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertDetailMovie(@org.jetbrains.annotations.NotNull()
    com.fghilmany.movieapp.core.data.source.local.entity.MovieEntity movie, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertDetailTv(@org.jetbrains.annotations.NotNull()
    com.fghilmany.movieapp.core.data.source.local.entity.TvSeriesEntity tvSeries, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @androidx.room.Update()
    public abstract void updateFavoriteMovie(@org.jetbrains.annotations.NotNull()
    com.fghilmany.movieapp.core.data.source.local.entity.MovieEntity movie);
    
    @androidx.room.Update()
    public abstract void updateFavoriteTvSeries(@org.jetbrains.annotations.NotNull()
    com.fghilmany.movieapp.core.data.source.local.entity.TvSeriesEntity tvSeries);
}