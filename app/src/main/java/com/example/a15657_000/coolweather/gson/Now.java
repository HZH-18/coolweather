package com.example.a15657_000.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 15657_000 on 2017/9/4 0004.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
