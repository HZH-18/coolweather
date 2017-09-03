package com.example.a15657_000.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 15657_000 on 2017/9/3 0003.
 */

public class Province extends DataSupport {
    private int id;
    private String provinceName;
    private int provibceCode;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvibceCode() {
        return provibceCode;
    }

    public void setProvibceCode(int provibceCode) {
        this.provibceCode = provibceCode;
    }
}
