package com.wanghan.demo.exception;


import lombok.Data;

@Data
public class GlobalException {

    public static final Integer OK = 0;
    public static final Integer ERROR = 100;

    private Integer code;
    private String message;
    private String url;
}
