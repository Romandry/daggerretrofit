package com.example.myapplication

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.repository.AnecdoteRepository
import java.lang.IllegalArgumentException
import javax.inject.Inject

//class AnecdoteViewModelFactory constructor(private val repository: AnecdoteRepository) :
//    ViewModelProvider.NewInstanceFactory() {
//
//    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
//        return when(modelClass){
//            AnectodeViewModel::class.java -> AnectodeViewModel(repository)
//            else -> throw IllegalArgumentException("ViewModel Not Found")
//        } as T
//    }
//}