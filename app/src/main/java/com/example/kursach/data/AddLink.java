package com.example.kursach.data;

import com.example.kursach.data.Entities.Root;

import retrofit2.Call;
import retrofit2.http.GET;

public interface AddLink {
    @GET("/jokes/random")
    Call<Root> getWeatherByCity();
}
