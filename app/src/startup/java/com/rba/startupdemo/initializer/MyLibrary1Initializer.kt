package com.rba.startupdemo.initializer

import android.content.Context
import androidx.startup.Initializer
import com.rba.mylibrary1.MyLibrary1

class MyLibrary1Initializer : Initializer<MyLibrary1> {

    lateinit var myLibrary1: MyLibrary1

    override fun create(context: Context): MyLibrary1 {

        myLibrary1 = MyLibrary1(context)
        myLibrary1.init()
        return myLibrary1
    }

    override fun dependencies(): List<Class<out Initializer<*>>> {
        return emptyList()
    }
}