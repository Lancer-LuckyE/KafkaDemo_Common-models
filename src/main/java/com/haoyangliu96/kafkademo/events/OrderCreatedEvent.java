package com.haoyangliu96.kafkademo.events;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.haoyangliu96.kafkademo.dtos.order.OrderItemDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@JsonTypeName("ORDER_CREATED")
@NoArgsConstructor
@AllArgsConstructor
public class OrderCreatedEvent extends AbstractOrderEvent {
    private List<OrderItemDTO> itemIds;

    public OrderCreatedEvent(UUID orderId, List<OrderItemDTO> itemIds) {
        super(orderId, KafkaOrderEventType.ORDER_CREATED);
        this.itemIds = itemIds;
    }
}
