package com.fghilmany.movieapp.presentation.tvseries;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/fghilmany/movieapp/presentation/tvseries/TvSeriesViewModel;", "Landroidx/lifecycle/ViewModel;", "dataUseCase", "Lcom/fghilmany/movieapp/core/domain/usecase/DataUseCase;", "(Lcom/fghilmany/movieapp/core/domain/usecase/DataUseCase;)V", "getMovies", "Landroidx/lifecycle/LiveData;", "Lcom/fghilmany/movieapp/core/data/Resource;", "", "Lcom/fghilmany/movieapp/core/domain/model/TvSeries;", "app_debug"})
public final class TvSeriesViewModel extends androidx.lifecycle.ViewModel {
    private final com.fghilmany.movieapp.core.domain.usecase.DataUseCase dataUseCase = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.fghilmany.movieapp.core.data.Resource<java.util.List<com.fghilmany.movieapp.core.domain.model.TvSeries>>> getMovies() {
        return null;
    }
    
    public TvSeriesViewModel(@org.jetbrains.annotations.NotNull()
    com.fghilmany.movieapp.core.domain.usecase.DataUseCase dataUseCase) {
        super();
    }
}