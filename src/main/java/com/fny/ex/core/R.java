package com.fny.ex.core;

import lombok.Data;

/**
 * @Name R
 * @Description R
 * @Author HRT
 * @Date 2024/5/29 10:58
 * @Version 1.0.0
 **/
@Data
public class R<T> {
    private Integer code;

    private String message;

    private T data;

    public R(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

//    public boolean isSuccess() {
//        return this.code == 0;
//    }
}
