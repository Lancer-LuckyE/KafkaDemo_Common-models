package com.haoyangliu96.kafkademo.entities.orderservice;

public enum OrderStatus {
    PENDING,
    WAITING_FOR_PAYMENT,
    OUT_OF_STOCK,
    PAYMENT_SUCCESS,
    PAYMENT_FAILED,
    CANCELLED,
    CONFIRMED
}
