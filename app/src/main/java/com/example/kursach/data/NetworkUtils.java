package com.example.kursach.data;

import android.util.Log;

import com.example.kursach.data.Entities.Root;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetworkUtils {
    // для работы с ретрофитом

    private AddLink jokeService;

    public NetworkUtils() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.icndb.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        jokeService = retrofit.create(AddLink.class);
    }

    public Root getJoke () {
        Call<Root> call = jokeService.getWeatherByCity();
        try {
            Response<Root> response = call.execute();
            // TODO
            if (response.isSuccessful()) {
                return response.body();
            }
        } catch(IOException ioex) {
        }
        return null;

    }
}
