package com.rba.startupdemo.initializer

import android.content.Context
import androidx.startup.Initializer
import com.rba.startupdemo.di.InitializerEntryPoint
import com.rba.startupdemo.di.MyLibrary3
import javax.inject.Inject

class MyLibrary3Initializer : Initializer<MyLibrary3> {

    @Inject
    lateinit var myLibrary3: MyLibrary3

    override fun create(context: Context): MyLibrary3 {
        InitializerEntryPoint.resolve(context).inject(this)

        myLibrary3.initialize()
        return myLibrary3
    }

    override fun dependencies(): List<Class<out Initializer<*>>> {
        return emptyList()
    }
}