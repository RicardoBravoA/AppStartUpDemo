package com.rba.startupdemo.di

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MyLibrary1 @Inject constructor() {

    var isInitialized: Boolean = false

    fun initialize() {
        isInitialized = true
    }
}