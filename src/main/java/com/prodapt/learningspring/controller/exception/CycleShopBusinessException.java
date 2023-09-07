package com.prodapt.learningspring.controller.exception;


public class CycleShopBusinessException extends RuntimeException{
    public CycleShopBusinessException(String message) {
        super(message);
    }
}
