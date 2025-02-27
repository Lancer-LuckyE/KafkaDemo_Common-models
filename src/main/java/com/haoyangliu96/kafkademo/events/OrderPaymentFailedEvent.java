package com.haoyangliu96.kafkademo.events;


import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@JsonTypeName("PAYMENT_FAILED")
@Getter
@Setter
@NoArgsConstructor
public class OrderPaymentFailedEvent extends AbstractOrderEvent{

    public OrderPaymentFailedEvent(UUID orderId) {
        super(orderId, KafkaOrderEventType.PAYMENT_FAILED);
    }
}
