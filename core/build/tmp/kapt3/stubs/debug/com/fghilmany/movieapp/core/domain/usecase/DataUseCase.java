package com.fghilmany.movieapp.core.domain.usecase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001c\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00040\u00032\u0006\u0010\n\u001a\u00020\u0007H&J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f0\u0003H&J\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\f0\u0003H&J\u001a\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f0\u00040\u0003H&J\u001a\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\f0\u00040\u0003H&J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0014H&J\u0018\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0014H&\u00a8\u0006\u0017"}, d2 = {"Lcom/fghilmany/movieapp/core/domain/usecase/DataUseCase;", "", "getDetailMovie", "Lkotlinx/coroutines/flow/Flow;", "Lcom/fghilmany/movieapp/core/data/Resource;", "Lcom/fghilmany/movieapp/core/domain/model/Movie;", "idMovie", "", "getDetailTv", "Lcom/fghilmany/movieapp/core/domain/model/TvSeries;", "idTv", "getFavoriteMovie", "", "getFavoriteTvSeries", "getListMovie", "getListTv", "setMovieFavorite", "", "movie", "state", "", "setTvSeriesFavorite", "tvSeries", "core_debug"})
public abstract interface DataUseCase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.fghilmany.movieapp.core.data.Resource<java.util.List<com.fghilmany.movieapp.core.domain.model.Movie>>> getListMovie();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.fghilmany.movieapp.core.data.Resource<java.util.List<com.fghilmany.movieapp.core.domain.model.TvSeries>>> getListTv();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.fghilmany.movieapp.core.data.Resource<com.fghilmany.movieapp.core.domain.model.TvSeries>> getDetailTv(@org.jetbrains.annotations.NotNull()
    java.lang.String idTv);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.fghilmany.movieapp.core.data.Resource<com.fghilmany.movieapp.core.domain.model.Movie>> getDetailMovie(@org.jetbrains.annotations.NotNull()
    java.lang.String idMovie);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.fghilmany.movieapp.core.domain.model.Movie>> getFavoriteMovie();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.fghilmany.movieapp.core.domain.model.TvSeries>> getFavoriteTvSeries();
    
    public abstract void setMovieFavorite(@org.jetbrains.annotations.NotNull()
    com.fghilmany.movieapp.core.domain.model.Movie movie, boolean state);
    
    public abstract void setTvSeriesFavorite(@org.jetbrains.annotations.NotNull()
    com.fghilmany.movieapp.core.domain.model.TvSeries tvSeries, boolean state);
}