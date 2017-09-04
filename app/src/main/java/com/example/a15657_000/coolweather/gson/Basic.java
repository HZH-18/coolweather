package com.example.a15657_000.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 15657_000 on 2017/9/4 0004.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
