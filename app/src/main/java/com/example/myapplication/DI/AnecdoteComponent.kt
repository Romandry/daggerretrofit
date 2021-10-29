package com.example.myapplication.DI

import android.content.Context
import com.example.myapplication.MainActivity
import dagger.BindsInstance
import dagger.Component

@Component(modules = [AnecdoteModule::class, DbModule::class])
interface AnecdoteComponent {

    fun inject(mainActivity: MainActivity)

//    (applicationContext as App).anecdoteComponent.inject(this)


    @Component.Builder
    interface Builder {
        @BindsInstance
        fun context(context: Context): Builder
        fun build(): AnecdoteComponent

    }

//    anecdoteComponent = DaggerAnecdoteComponent.builder()
//    .context(this)
//    .build()
}