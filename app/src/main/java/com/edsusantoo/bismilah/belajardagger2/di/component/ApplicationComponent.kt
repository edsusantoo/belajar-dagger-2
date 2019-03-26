package com.edsusantoo.bismilah.belajardagger2.di.component

import android.app.Application
import com.edsusantoo.bismilah.belajardagger2.BelajarDagger2Application
import com.edsusantoo.bismilah.belajardagger2.di.builder.ActivityBuilder
import com.edsusantoo.bismilah.belajardagger2.di.module.ApplicationModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [(AndroidInjectionModule::class), (ApplicationModule::class),(ActivityBuilder::class)])
interface ApplicationComponent {
    @Component.Builder
    interface Builder{
        @BindsInstance
        fun application(application:Application):Builder
        fun build():ApplicationComponent
    }
    fun inject(app: BelajarDagger2Application)
}