package com.rba.mylibrary3

import android.content.Context
import android.util.Log

class MyLibrary3(private val context: Context) {

    init {
        Log.i("MyLibrary3", "initialize")
    }

    fun actionX(){
        Log.i("MyLibrary3", "actionX")
    }

}