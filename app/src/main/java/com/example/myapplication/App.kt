package com.example.myapplication

import android.app.Application
import androidx.multidex.MultiDexApplication
import com.example.myapplication.DI.AnecdoteComponent
import com.example.myapplication.DI.AnecdoteModule
import com.example.myapplication.DI.DaggerAnecdoteComponent


class App : MultiDexApplication() {
    lateinit var anecdoteComponent: AnecdoteComponent

    override fun onCreate() {
        super.onCreate()
        anecdoteComponent = DaggerAnecdoteComponent.builder()
//            .anecdoteModule(AnecdoteModule())
            .build()
    }

}