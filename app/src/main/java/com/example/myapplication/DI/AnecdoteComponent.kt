package com.example.myapplication.DI

import com.example.myapplication.MainActivity
import dagger.Component

@Component(modules = [AnecdoteModule::class])
interface AnecdoteComponent {

    fun inject(mainActivity: MainActivity)
}