package com.fghilmany.movieapp.core.di

import androidx.room.Room
import com.fghilmany.movieapp.core.BuildConfig
import com.fghilmany.movieapp.core.data.DataRepository
import com.fghilmany.movieapp.core.data.source.local.LocalDataSource
import com.fghilmany.movieapp.core.data.source.local.room.MovieTvDatabase
import com.fghilmany.movieapp.core.data.source.remote.RemoteDataSource
import com.fghilmany.movieapp.core.data.source.remote.network.ApiService
import com.fghilmany.movieapp.core.domain.repository.IDataRepository
import com.fghilmany.movieapp.core.utils.AppExecutors
import net.sqlcipher.database.SQLiteDatabase
import net.sqlcipher.database.SupportFactory
import okhttp3.CertificatePinner
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
        val passphrase: ByteArray = SQLiteDatabase.getBytes("fghilmany".toCharArray())
        val factory = SupportFactory(passphrase)
        Room.databaseBuilder(
            androidContext(),
            MovieTvDatabase::class.java, "MovieTv"
        ).fallbackToDestructiveMigration()
            .openHelperFactory(factory)
            .build()
    }
}

val networkModule = module {
    single {
        val hostname = "api.themoviedb.org"
        val certificatePinner = CertificatePinner.Builder()
            .add(hostname, "sha256/HkCBucsA3Tgiby96X7vjb/ojHaE1BrjvZ2+LRdJJd0E=")
            .add(hostname, "sha256/nKWcsYrc+y5I8vLf1VGByjbt+Hnasjl+9h8lNKJytoE=")
            .add(hostname, "sha256/r/mIkG3eEpVdm+u/ko/cwxzOMo1bk4TyHIlByibiA5E=")
            .build()
        val interceptor = HttpLoggingInterceptor()
        interceptor.apply { interceptor.level = HttpLoggingInterceptor.Level.BODY }
        OkHttpClient.Builder()
            .connectTimeout(30, TimeUnit.SECONDS)
            .writeTimeout(30, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
            .addInterceptor(interceptor)
            .certificatePinner(certificatePinner)
            .build()


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
    single<IDataRepository> {
        DataRepository(
            get(),
            get(),
            get()
        )
    }
}