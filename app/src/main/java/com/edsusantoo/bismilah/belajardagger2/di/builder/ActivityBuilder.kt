package com.edsusantoo.bismilah.belajardagger2.di.builder

import com.edsusantoo.bismilah.belajardagger2.ui.main.MainActivity
import com.edsusantoo.bismilah.belajardagger2.ui.main.MainActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class ActivityBuilder {
    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    abstract fun bindMainActivity():MainActivity
}