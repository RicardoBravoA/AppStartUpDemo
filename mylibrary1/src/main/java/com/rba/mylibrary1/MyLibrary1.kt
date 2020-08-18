package com.rba.mylibrary1

import android.content.Context
import android.util.Log

class MyLibrary1(private val context: Context) {

    fun init() {
        Log.i("MyLibrary1", "initialize")
    }

    fun load() {
        Log.i("MyLibrary1", "Load")
    }

}