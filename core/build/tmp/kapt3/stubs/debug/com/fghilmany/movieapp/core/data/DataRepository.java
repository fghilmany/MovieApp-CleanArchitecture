package com.fghilmany.movieapp.core.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001c\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000b0\n2\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J\u0014\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00130\nH\u0016J\u0014\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00130\nH\u0016J\u001a\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00130\u000b0\nH\u0016J\u001a\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00130\u000b0\nH\u0016J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0018\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u001bH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/fghilmany/movieapp/core/data/DataRepository;", "Lcom/fghilmany/movieapp/core/domain/repository/IDataRepository;", "remoteDataSource", "Lcom/fghilmany/movieapp/core/data/source/remote/RemoteDataSource;", "localDataSource", "Lcom/fghilmany/movieapp/core/data/source/local/LocalDataSource;", "appExecutors", "Lcom/fghilmany/movieapp/core/utils/AppExecutors;", "(Lcom/fghilmany/movieapp/core/data/source/remote/RemoteDataSource;Lcom/fghilmany/movieapp/core/data/source/local/LocalDataSource;Lcom/fghilmany/movieapp/core/utils/AppExecutors;)V", "getDetailMovie", "Lkotlinx/coroutines/flow/Flow;", "Lcom/fghilmany/movieapp/core/data/Resource;", "Lcom/fghilmany/movieapp/core/domain/model/Movie;", "idMovie", "", "getDetailTv", "Lcom/fghilmany/movieapp/core/domain/model/TvSeries;", "idTv", "getFavoriteMovie", "", "getFavoriteTvSeries", "getListMovie", "getListTv", "setMovieFavorite", "", "movie", "state", "", "setTvSeriesFavorite", "tvSeries", "core_debug"})
public final class DataRepository implements com.fghilmany.movieapp.core.domain.repository.IDataRepository {
    private final com.fghilmany.movieapp.core.data.source.remote.RemoteDataSource remoteDataSource = null;
    private final com.fghilmany.movieapp.core.data.source.local.LocalDataSource localDataSource = null;
    private final com.fghilmany.movieapp.core.utils.AppExecutors appExecutors = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.fghilmany.movieapp.core.data.Resource<java.util.List<com.fghilmany.movieapp.core.domain.model.Movie>>> getListMovie() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.fghilmany.movieapp.core.data.Resource<java.util.List<com.fghilmany.movieapp.core.domain.model.TvSeries>>> getListTv() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.fghilmany.movieapp.core.data.Resource<com.fghilmany.movieapp.core.domain.model.TvSeries>> getDetailTv(@org.jetbrains.annotations.NotNull()
    java.lang.String idTv) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.fghilmany.movieapp.core.data.Resource<com.fghilmany.movieapp.core.domain.model.Movie>> getDetailMovie(@org.jetbrains.annotations.NotNull()
    java.lang.String idMovie) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<java.util.List<com.fghilmany.movieapp.core.domain.model.Movie>> getFavoriteMovie() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<java.util.List<com.fghilmany.movieapp.core.domain.model.TvSeries>> getFavoriteTvSeries() {
        return null;
    }
    
    @java.lang.Override()
    public void setMovieFavorite(@org.jetbrains.annotations.NotNull()
    com.fghilmany.movieapp.core.domain.model.Movie movie, boolean state) {
    }
    
    @java.lang.Override()
    public void setTvSeriesFavorite(@org.jetbrains.annotations.NotNull()
    com.fghilmany.movieapp.core.domain.model.TvSeries tvSeries, boolean state) {
    }
    
    public DataRepository(@org.jetbrains.annotations.NotNull()
    com.fghilmany.movieapp.core.data.source.remote.RemoteDataSource remoteDataSource, @org.jetbrains.annotations.NotNull()
    com.fghilmany.movieapp.core.data.source.local.LocalDataSource localDataSource, @org.jetbrains.annotations.NotNull()
    com.fghilmany.movieapp.core.utils.AppExecutors appExecutors) {
        super();
    }
}