package com.accenture.day6.exception.customize;

public class CustomException extends RuntimeException{

    public static final String EMPTY_NAME = "The name is empty. Try again.";
    public static final String INCORRECT_NAME = "The name is incorrect. Try again.";

    public CustomException(String message) {
        super(message);
    }
}
