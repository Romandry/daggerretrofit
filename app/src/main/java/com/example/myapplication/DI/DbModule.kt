package com.example.myapplication.DI

import android.content.Context
import androidx.room.Room
import com.example.myapplication.DAO.AnecdoteDao
import com.example.myapplication.DAO.AnecdoteDatabase
import dagger.Module
import dagger.Provides

@Module
class DbModule {



    @Provides
    fun getDatabase(context: Context): AnecdoteDao {

            return Room.databaseBuilder(
                    context.applicationContext,
                    AnecdoteDatabase::class.java,
                    "anecdote_database"
            ).build().getAnecdoteDao()


    }
}