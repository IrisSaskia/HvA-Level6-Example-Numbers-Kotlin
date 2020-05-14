package com.example.numbers_kotlin.model

import retrofit2.http.GET
import retrofit2.Call

public interface NumbersApiService {

    // The GET method needed to retrieve a random number trivia.
    @GET("/random/trivia?json")
    fun getRandomNumberTrivia(): Call<Trivia>
}