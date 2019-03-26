package com.edsusantoo.bismilah.belajardagger2

import android.app.Activity
import android.app.Application
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

class BelajarDagger2Application : Application(), HasActivityInjector {

    @Inject
    internal lateinit var activityDispatchingAndoridInjector: DispatchingAndroidInjector<Activity>

    override fun activityInjector(): AndroidInjector<Activity> = activityDispatchingAndoridInjector

    override fun onCreate() {
        super.onCreate()

    }
}