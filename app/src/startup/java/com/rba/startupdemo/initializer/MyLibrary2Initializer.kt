package com.rba.startupdemo.initializer

import android.content.Context
import androidx.startup.Initializer
import com.rba.mylibrary2.MyLibrary2

class MyLibrary2Initializer : Initializer<MyLibrary2> {

    lateinit var myLibrary2: MyLibrary2

    override fun create(context: Context): MyLibrary2 {
        myLibrary2 = MyLibrary2()
        return myLibrary2
    }

    override fun dependencies(): List<Class<out Initializer<*>>> {
        return emptyList()
    }
}