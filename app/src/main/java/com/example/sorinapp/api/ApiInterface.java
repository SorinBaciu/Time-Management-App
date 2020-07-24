package com.example.sorinapp.api;

import com.example.sorinapp.models.News;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("top-headlines")
    Call<News> getNews(

            @Query("country") String country,
            @Query("category") String category,
            @Query("apiKey") String apiKey

    );
}
