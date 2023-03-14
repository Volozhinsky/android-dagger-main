package com.example.android.dagger.di

import android.content.Context
import com.example.android.dagger.main.MainActivity
import com.example.android.dagger.registration.RegistrationComponent
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [StorageModule::class,AppSubcomponents::class])
interface AppCpmponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppCpmponent
    }

    fun registrationComponent(): RegistrationComponent.Factory

    fun inject(activity: MainActivity)
}