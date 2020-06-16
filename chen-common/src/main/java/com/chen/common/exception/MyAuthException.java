package com.chen.common.exception;

public class MyAuthException extends Exception{

    private static final long serialVersionUID = -6916154462432027437L;

    public MyAuthException(String message){
        super(message);
    }
}