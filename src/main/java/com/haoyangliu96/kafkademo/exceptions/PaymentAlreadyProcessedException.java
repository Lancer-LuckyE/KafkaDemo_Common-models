package com.haoyangliu96.kafkademo.exceptions;

public class PaymentAlreadyProcessedException extends RuntimeException {
    public PaymentAlreadyProcessedException(String message) {
        super(message);
    }

    public PaymentAlreadyProcessedException(String message, Throwable e) {
        super(message, e);
    }
}
