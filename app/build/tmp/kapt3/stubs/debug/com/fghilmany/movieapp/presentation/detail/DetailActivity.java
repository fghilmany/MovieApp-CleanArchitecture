package com.fghilmany.movieapp.presentation.detail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\u0012\u0010\u000f\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0003J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0003J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0017"}, d2 = {"Lcom/fghilmany/movieapp/presentation/detail/DetailActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "state", "", "viewModel", "Lcom/fghilmany/movieapp/presentation/detail/DetailViewModel;", "getViewModel", "()Lcom/fghilmany/movieapp/presentation/detail/DetailViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "populateMovie", "detailMovie", "Lcom/fghilmany/movieapp/core/domain/model/Movie;", "populateTvSeries", "detailTvSeries", "Lcom/fghilmany/movieapp/core/domain/model/TvSeries;", "setFavoriteState", "Companion", "app_debug"})
public final class DetailActivity extends androidx.appcompat.app.AppCompatActivity {
    private final kotlin.Lazy viewModel$delegate = null;
    private boolean state;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_ID_MOVIE = "extra_id_movie";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_ID_TV = "extra_id_tv";
    public static final com.fghilmany.movieapp.presentation.detail.DetailActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.fghilmany.movieapp.presentation.detail.DetailViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setFavoriteState(boolean state) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void populateMovie(com.fghilmany.movieapp.core.domain.model.Movie detailMovie) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void populateTvSeries(com.fghilmany.movieapp.core.domain.model.TvSeries detailTvSeries) {
    }
    
    public DetailActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/fghilmany/movieapp/presentation/detail/DetailActivity$Companion;", "", "()V", "EXTRA_ID_MOVIE", "", "EXTRA_ID_TV", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}