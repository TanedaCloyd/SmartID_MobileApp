package com.example.smartid;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    private static Retrofit retrofit = null;

    // FIX: Using the deployed Render URL as the single connection point
    private static final String BASE_URL = "https://smartid-o12y.onrender.com/";

    public static Retrofit getClient() {
        if (retrofit == null) {
            // The logic is now simplified to directly use the deployed URL
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}