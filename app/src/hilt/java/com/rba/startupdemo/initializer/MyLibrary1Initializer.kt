package com.rba.startupdemo.initializer

import android.content.Context
import androidx.startup.Initializer
import com.rba.startupdemo.di.InitializerEntryPoint
import com.rba.startupdemo.di.MyLibrary1
import javax.inject.Inject

class MyLibrary1Initializer : Initializer<MyLibrary1> {

    @Inject
    lateinit var myLibrary1: MyLibrary1

    override fun create(context: Context): MyLibrary1 {
        InitializerEntryPoint.resolve(context).inject(this)

        myLibrary1.initialize()
        return myLibrary1
    }

    override fun dependencies(): List<Class<out Initializer<*>>> {
        return emptyList()
    }
}