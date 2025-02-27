package com.haoyangliu96.kafkademo.events;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@ToString
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "eventType") // 在 JSON 里加上类型信息
@JsonSubTypes({
        @JsonSubTypes.Type(value = OrderCreatedEvent.class, name = "ORDER_CREATED"),
        @JsonSubTypes.Type(value = OrderOutOfStockEvent.class, name = "OUT_OF_STOCK"),
        @JsonSubTypes.Type(value = OrderReadyForPaymentEvent.class, name = "READY_FOR_PAYMENT"),
        @JsonSubTypes.Type(value = OrderPaymentSuccessEvent.class, name = "PAYMENT_SUCCESS"),
        @JsonSubTypes.Type(value = OrderPaymentFailedEvent.class, name = "PAYMENT_FAILED"),
        @JsonSubTypes.Type(value = InventoryUpdateEvent.class, name = "UPDATE_STOCK")
})
@NoArgsConstructor
@AllArgsConstructor
public abstract class AbstractOrderEvent {
    private UUID orderId;
    private KafkaOrderEventType eventType;
}
