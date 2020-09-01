package com.fghilmany.movieapp.core.di

import androidx.room.Room
import com.fghilmany.movieapp.BuildConfig
import com.fghilmany.movieapp.core.data.DataRepository
import com.fghilmany.movieapp.core.domain.repository.IDataRepository
import com.fghilmany.movieapp.core.data.source.local.LocalDataSource
import com.fghilmany.movieapp.core.data.source.local.room.MovieTvDatabase
import com.fghilmany.movieapp.core.data.source.remote.RemoteDataSource
import com.fghilmany.movieapp.core.data.source.remote.network.ApiService
import com.fghilmany.movieapp.core.utils.AppExecutors
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

val databaseModule = module {
    factory { get<MovieTvDatabase>().movieTvDao() }
    single {
        Room.databaseBuilder(
            androidContext(),
            MovieTvDatabase::class.java, "MovieTv"
        ).fallbackToDestructiveMigration().build()
    }
}

val networkModule = module {
    single {
        val interceptor = HttpLoggingInterceptor()
        interceptor.apply { interceptor.level = HttpLoggingInterceptor.Level.BODY }
        OkHttpClient.Builder()
            .connectTimeout(30, TimeUnit.SECONDS)
            .writeTimeout(30, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
            .addInterceptor(interceptor).build()


    }

    single {
        val retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .client(get())
            .baseUrl(BuildConfig.TMDB_BASE_URL)
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()

        retrofit.create(ApiService::class.java)
    }
}

val repositoryModule = module {
    single { RemoteDataSource(get()) }
    single { LocalDataSource(get()) }
    factory { AppExecutors() }
    single<IDataRepository> { DataRepository(get(), get(), get()) }
}