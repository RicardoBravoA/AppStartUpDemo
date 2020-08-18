package com.rba.startupdemo.initializer

import android.content.Context
import androidx.startup.Initializer
import com.rba.startupdemo.di.InitializerEntryPoint
import com.rba.startupdemo.di.MyLibrary2
import javax.inject.Inject

class MyLibrary2Initializer : Initializer<MyLibrary2> {

    @Inject
    lateinit var myLibrary2: MyLibrary2

    override fun create(context: Context): MyLibrary2 {
        InitializerEntryPoint.resolve(context).inject(this)

        myLibrary2.initialize()
        return myLibrary2
    }

    override fun dependencies(): List<Class<out Initializer<*>>> {
        return emptyList()
    }
}