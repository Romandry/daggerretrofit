package com.example.myapplication

import android.app.Application
import android.content.Context
import androidx.multidex.MultiDexApplication
import com.example.myapplication.DI.AnecdoteComponent
import com.example.myapplication.DI.AnecdoteModule
import com.example.myapplication.DI.DaggerAnecdoteComponent


class App : MultiDexApplication() {
    lateinit var anecdoteComponent: AnecdoteComponent

    override fun onCreate() {
        super.onCreate()
        anecdoteComponent = DaggerAnecdoteComponent.builder()
                .context(this)
            .build()
    }

}