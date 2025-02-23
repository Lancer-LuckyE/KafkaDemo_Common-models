package com.haoyangliu96.kafkademo.dtos.order;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class OrderItemsDTO {
    private ItemDTO item;
    private int quantity;
}
