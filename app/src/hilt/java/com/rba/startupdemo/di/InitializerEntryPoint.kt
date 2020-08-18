package com.rba.startupdemo.di

import android.content.Context
import com.rba.startupdemo.initializer.MyLibrary1Initializer
import com.rba.startupdemo.initializer.MyLibrary2Initializer
import com.rba.startupdemo.initializer.MyLibrary3Initializer
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.android.EntryPointAccessors
import dagger.hilt.android.components.ApplicationComponent

@EntryPoint
@InstallIn(ApplicationComponent::class)
interface InitializerEntryPoint {

    companion object {
        fun resolve(context: Context): InitializerEntryPoint {
            val appContext = context.applicationContext ?: throw IllegalStateException()
            return EntryPointAccessors.fromApplication(
                appContext,
                InitializerEntryPoint::class.java
            )
        }
    }

    fun inject(initializer: MyLibrary1Initializer)
    fun inject(initializer: MyLibrary2Initializer)
    fun inject(initializer: MyLibrary3Initializer)

}