package com.rba.startupdemo.app

import android.app.Application
import com.rba.mylibrary1.MyLibrary1
import com.rba.mylibrary2.MyLibrary2
import com.rba.mylibrary3.MyLibrary3

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        MyLibrary1(applicationContext)
        MyLibrary2()
        MyLibrary3(applicationContext)
    }

}