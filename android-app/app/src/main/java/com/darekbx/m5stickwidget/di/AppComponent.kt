package com.darekbx.m5stickwidget.di

import com.darekbx.m5stickwidget.NotificationService
import com.darekbx.m5stickwidget.ui.MainActivity
import com.rpifilebrowser.di.viewmodels.ViewModelModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, ViewModelModule::class])
interface AppComponent {

    fun inject(mainActivity: MainActivity)
    fun inject(notificationService: NotificationService)
}