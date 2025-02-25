package com.haoyangliu96.kafkademo.events;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.UUID;

@JsonTypeName("READY_FOR_PAYMENT")
@NoArgsConstructor
public class OrderReadyForPaymentEvent extends AbstractOrderEvent {
    public OrderReadyForPaymentEvent(UUID orderId) {
        super(orderId, KafkaOrderEventType.READY_FOR_PAYMENT);
    }
}
