package com.passmate.api.common.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.HashMap;

@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class JsonResult {

    private boolean result;
    private String message;
    private String messageText;
    private Exception exception;
    private HashMap<String, Object> data = new HashMap<String, Object>();

    public JsonResult(){}
    public JsonResult(boolean result){
        this.result = result;
    }

    public JsonResult(boolean result, String message){
        this.result = result;
        this.message = message;
    }

    public JsonResult(boolean result, String message, String messageText){
        this.result = result;
        this.message = message;
        this.messageText = messageText;
    }

    public JsonResult(boolean result, HashMap<String, Object> data){
        this.result = result;
        this.data = data;
    }

    public JsonResult(boolean result, String message, HashMap<String, Object> data){
        this.result = result;
        this.message = message;
        this.data = data;
    }

    public void putData(String key, Object value){
        this.data.put(key, value);
    }
}
