package com.zrq.player.bean;

import androidx.annotation.Keep;

import java.util.List;

@Keep
public class Related {

    private int code;
    private List<RelateDao> data;
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<RelateDao> getData() {
        return data;
    }

    public void setData(List<RelateDao> data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
