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
        @JsonSubTypes.Type(value = OrderCreatedEvent.class, name = "ORDER_CREATED")
})
@NoArgsConstructor
@AllArgsConstructor
public abstract class AbstractOrderEvent {
    private UUID orderId;
    private KafkaOrderEventType eventType;
}
