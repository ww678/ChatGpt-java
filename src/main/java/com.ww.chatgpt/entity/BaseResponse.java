package com.ww.chatgpt.entity;

import lombok.Data;

import java.util.List;

/**
 * @author ww
 */
@Data
public class BaseResponse<T> {
    private String object;
    private List<T> data;
    private Error error;


    @Data
    public class Error {
        private String message;
        private String type;
        private String param;
        private String code;
    }
}
