package com.fghilmany.movieapp

import android.app.Application
import com.fghilmany.movieapp.core.di.databaseModule
import com.fghilmany.movieapp.core.di.networkModule
import com.fghilmany.movieapp.core.di.repositoryModule
import com.fghilmany.movieapp.di.useCaseModule
import com.fghilmany.movieapp.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin


class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@MyApplication)
            modules(
                listOf(
                    databaseModule,
                    networkModule,
                    repositoryModule,
                    useCaseModule,
                    viewModelModule
                )
            )
        }

    }
}