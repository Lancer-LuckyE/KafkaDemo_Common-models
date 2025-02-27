package com.haoyangliu96.kafkademo.events;


import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@JsonTypeName("PAYMENT_SUCCESS")
@Getter
@Setter
@NoArgsConstructor
public class OrderPaymentSuccessEvent extends AbstractOrderEvent{

    public OrderPaymentSuccessEvent(UUID orderId) {
        super(orderId, KafkaOrderEventType.PAYMENT_SUCCESS);
    }
}
