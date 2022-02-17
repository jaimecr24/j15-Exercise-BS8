package com.exercise.bs8.persona.infrastructure.controller;

import java.util.Date;

public class CustomError {
    private final Date timeStamp;
    private final int httpCode;
    private final String message;

    public CustomError(Date timeStamp, int httpCode, String message){
        super();
        this.timeStamp = timeStamp;
        this.httpCode = httpCode;
        this.message = message;
    }

    public String getMessage(){
        return message;
    }

    public Date getTimeStamp(){
        return timeStamp;
    }
}
