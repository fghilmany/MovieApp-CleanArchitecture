package com.fghilmany.movieapp.notification

import org.koin.dsl.module

val notificationModule = module {
    single { AlarmReceiver() }
}