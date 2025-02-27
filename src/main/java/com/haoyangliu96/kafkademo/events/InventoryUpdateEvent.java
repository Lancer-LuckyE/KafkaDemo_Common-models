package com.haoyangliu96.kafkademo.events;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.haoyangliu96.kafkademo.entities.orderservice.OrderItem;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@JsonTypeName("UPDATE_STOCK")
@Getter
@Setter
@NoArgsConstructor
public class InventoryUpdateEvent extends AbstractOrderEvent{
    private List<OrderItem> orderItems;

    public InventoryUpdateEvent(UUID orderId, List<OrderItem>orderItems) {
        super(orderId, KafkaOrderEventType.UPDATE_STOCK);
        this.orderItems = orderItems;
    }
}
