package com.haoyangliu96.kafkademo.events;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.*;

import java.util.UUID;

@JsonTypeName("READY_FOR_PAYMENT")
@NoArgsConstructor
@Getter
@Setter
public class OrderReadyForPaymentEvent extends AbstractOrderEvent {
    private double amount;
    public OrderReadyForPaymentEvent(UUID orderId, double amount) {
        super(orderId, KafkaOrderEventType.READY_FOR_PAYMENT);
        this.amount = amount;
    }
}
