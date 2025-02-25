package com.haoyangliu96.kafkademo.events;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.UUID;

@JsonTypeName("OUT_OF_STOCK")
@NoArgsConstructor
public class OrderOutOfStockEvent extends AbstractOrderEvent {
    public OrderOutOfStockEvent(UUID orderId) {
        super(orderId, KafkaOrderEventType.OUT_OF_STOCK);
    }
}
