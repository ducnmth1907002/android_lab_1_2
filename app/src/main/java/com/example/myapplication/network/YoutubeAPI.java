package com.example.myapplication.network;

import com.google.gson.JsonElement;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface YoutubeAPI {

    String API_URL = "https://youtube.googleapis.com/youtube/v3/";
    String API_KEY = "AIzaSyBzUluUQ6S4rQ-o4QVz295HHj9Jtc_f6Xw";
    String API_PARAMETER_PART = "snippet";
    String API_PARAMETER_CONTENT_DETAIL = "statistics";

    @GET("search")
    Call<JsonElement> search(@Query("q") String q, @Query("maxResults") int maxResults);

    @GET("videos")
    Call<JsonElement> getDetail(@Query("id") String id);
}
