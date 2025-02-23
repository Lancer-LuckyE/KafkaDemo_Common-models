package com.haoyangliu96.kafkademo.dtos.order;

import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class OrderDTO {
    private String orderId;
    private String customerId;
    private String status;
    private List<OrderItemsDTO> orderItems;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
