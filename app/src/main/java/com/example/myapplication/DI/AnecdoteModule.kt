package com.example.myapplication.DI

import com.example.myapplication.API.AnecdoteAPI
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
class AnecdoteModule {

//    @Singleton
    @Provides
    fun getApiArguments(): AnecdoteAPI {
        val retrofit = Retrofit.Builder()
            .baseUrl("http://umorili.herokuapp.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        var x = retrofit.create(AnecdoteAPI::class.java)
        return x
    }

    @Provides
    fun createCat(): Cat {
        return Cat("Bob")
    }
}

data class Cat(val name: String)
