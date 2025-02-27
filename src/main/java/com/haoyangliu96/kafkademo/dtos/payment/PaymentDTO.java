package com.haoyangliu96.kafkademo.dtos.payment;

import com.haoyangliu96.kafkademo.entities.paymentserivice.PaymentStatus;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class PaymentDTO {
    private UUID paymentId;
    private UUID orderId;
    private double amount;
    private PaymentStatus paymentStatus;
    private LocalDateTime createdAt;
}
