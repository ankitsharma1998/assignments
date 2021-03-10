package com.springrestapi.Springrestapi.hello;

public class Hellobean {
    private String message;
    public Hellobean(){

    }
    public Hellobean (String message){
        this.message=message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
