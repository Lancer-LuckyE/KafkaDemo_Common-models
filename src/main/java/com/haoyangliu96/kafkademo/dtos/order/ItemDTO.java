package com.haoyangliu96.kafkademo.dtos.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class ItemDTO {
    @JsonProperty("productId")
    private UUID itemId;
    private String name;
}
