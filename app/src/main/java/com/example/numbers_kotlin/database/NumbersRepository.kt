package com.example.numbers_kotlin.database

import com.example.numbers_kotlin.model.NumbersApi
import com.example.numbers_kotlin.model.NumbersApiService

class NumbersRepository {
    private val numbersApi: NumbersApiService = NumbersApi.createApi()

    fun getRandomNumberTrivia() = numbersApi.getRandomNumberTrivia()
}