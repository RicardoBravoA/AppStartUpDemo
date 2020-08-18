package com.rba.startupdemo.initializer

import android.content.Context
import androidx.startup.Initializer
import com.rba.mylibrary3.MyLibrary3

class MyLibrary3Initializer : Initializer<MyLibrary3> {

    lateinit var myLibrary3: MyLibrary3

    override fun create(context: Context): MyLibrary3 {
        myLibrary3 = MyLibrary3(context)
        myLibrary3.actionX()
        return myLibrary3
    }

    override fun dependencies(): List<Class<out Initializer<*>>> {
        return emptyList()
    }
}