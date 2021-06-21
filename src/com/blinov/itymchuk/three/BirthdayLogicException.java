package com.blinov.itymchuk.three;

public class BirthdayLogicException extends Exception {
    public BirthdayLogicException() {
    }

    public BirthdayLogicException(String message, Throwable exception){
        super(message, exception);
    }

    public BirthdayLogicException(String message){
        super(message);
    }

    public BirthdayLogicException(Throwable exception){
        super(exception);
    }
}
