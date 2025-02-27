package com.haoyangliu96.kafkademo.events;

public enum KafkaOrderEventType {
    ORDER_CREATED,
    OUT_OF_STOCK,
    READY_FOR_PAYMENT,
    PAYMENT_SUCCESS,
    PAYMENT_FAILED,
    UPDATE_STOCK
}
