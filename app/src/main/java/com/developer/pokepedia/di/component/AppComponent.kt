package com.developer.pokepedia.di.component

import com.developer.pokepedia.application.PokeApplication
import com.developer.pokepedia.di.module.data.HttpConnectionModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(modules = [HttpConnectionModule::class])
interface AppComponent : AndroidInjector<PokeApplication> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: PokeApplication): Builder

        fun builds()

    }

}