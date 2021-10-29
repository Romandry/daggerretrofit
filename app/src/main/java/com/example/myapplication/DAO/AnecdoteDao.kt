package com.example.myapplication.DAO

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.myapplication.API.Anecdote

@Dao
interface AnecdoteDao {

    @Query("SELECT * FROM anecdote")
    suspend fun getAllAnecdotes(): List<Anecdote>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addAnecdotes(anecdoteList: List<Anecdote>)

    @Query("DELETE FROM anecdote")
    suspend fun deleteAllAnecdotes()
}