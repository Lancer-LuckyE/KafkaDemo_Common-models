package com.haoyangliu96.kafkademo.exceptions;

public class KafkaEventException extends RuntimeException {
    public KafkaEventException(String message) {
        super(message);
    }

    public KafkaEventException(String message, Throwable cause) {
        super(message, cause);
    }
}
