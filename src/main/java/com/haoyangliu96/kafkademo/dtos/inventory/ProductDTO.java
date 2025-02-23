package com.haoyangliu96.kafkademo.dtos.inventory;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class ProductDTO {
    private String productId;
    private String name;
    private double price;
    private int stock;
}
