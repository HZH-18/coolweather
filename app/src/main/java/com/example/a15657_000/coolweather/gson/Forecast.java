package com.example.a15657_000.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 15657_000 on 2017/9/4 0004.
 */

public class Forecast {
    public String date;
    @SerializedName("cond")
    public More more;
    @SerializedName("tmp")
    public Temperature temperature;

    public class More{
        @SerializedName("txt_d")
        public String info;
    }

    public class Temperature{
        public String Max;
        public String Min;
    }
}
