package com.fghilmany.movieapp.presentation.detail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u0013J\u000e\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u0013J\u0006\u0010\u001e\u001a\u00020\u001cJ\u0006\u0010\u001f\u001a\u00020\u001cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR&\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017\u00a8\u0006 "}, d2 = {"Lcom/fghilmany/movieapp/presentation/detail/DetailViewModel;", "Landroidx/lifecycle/ViewModel;", "dataUseCase", "Lcom/fghilmany/movieapp/core/domain/usecase/DataUseCase;", "(Lcom/fghilmany/movieapp/core/domain/usecase/DataUseCase;)V", "getDetailMovie", "Landroidx/lifecycle/LiveData;", "Lcom/fghilmany/movieapp/core/data/Resource;", "Lcom/fghilmany/movieapp/core/domain/model/Movie;", "getGetDetailMovie", "()Landroidx/lifecycle/LiveData;", "setGetDetailMovie", "(Landroidx/lifecycle/LiveData;)V", "getDetailTvSeries", "Lcom/fghilmany/movieapp/core/domain/model/TvSeries;", "getGetDetailTvSeries", "setGetDetailTvSeries", "idMovie", "Landroidx/lifecycle/MutableLiveData;", "", "getIdMovie", "()Landroidx/lifecycle/MutableLiveData;", "setIdMovie", "(Landroidx/lifecycle/MutableLiveData;)V", "idTvSeries", "getIdTvSeries", "setIdTvSeries", "selectedMovie", "", "selectedTvSeries", "setFavoriteMovie", "setFavoriteTvSeries", "app_debug"})
public final class DetailViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> idMovie;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> idTvSeries;
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.LiveData<com.fghilmany.movieapp.core.data.Resource<com.fghilmany.movieapp.core.domain.model.Movie>> getDetailMovie;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<com.fghilmany.movieapp.core.data.Resource<com.fghilmany.movieapp.core.domain.model.TvSeries>> getDetailTvSeries;
    private final com.fghilmany.movieapp.core.domain.usecase.DataUseCase dataUseCase = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getIdMovie() {
        return null;
    }
    
    public final void setIdMovie(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getIdTvSeries() {
        return null;
    }
    
    public final void setIdTvSeries(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    public final void selectedMovie(@org.jetbrains.annotations.NotNull()
    java.lang.String idMovie) {
    }
    
    public final void selectedTvSeries(@org.jetbrains.annotations.NotNull()
    java.lang.String idTvSeries) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.LiveData<com.fghilmany.movieapp.core.data.Resource<com.fghilmany.movieapp.core.domain.model.Movie>> getGetDetailMovie() {
        return null;
    }
    
    public final void setGetDetailMovie(@org.jetbrains.annotations.Nullable()
    androidx.lifecycle.LiveData<com.fghilmany.movieapp.core.data.Resource<com.fghilmany.movieapp.core.domain.model.Movie>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.fghilmany.movieapp.core.data.Resource<com.fghilmany.movieapp.core.domain.model.TvSeries>> getGetDetailTvSeries() {
        return null;
    }
    
    public final void setGetDetailTvSeries(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<com.fghilmany.movieapp.core.data.Resource<com.fghilmany.movieapp.core.domain.model.TvSeries>> p0) {
    }
    
    public final void setFavoriteMovie() {
    }
    
    public final void setFavoriteTvSeries() {
    }
    
    public DetailViewModel(@org.jetbrains.annotations.NotNull()
    com.fghilmany.movieapp.core.domain.usecase.DataUseCase dataUseCase) {
        super();
    }
}