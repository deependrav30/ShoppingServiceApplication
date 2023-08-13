package com.stickyio.orderservice.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class OrderRequestDto {
    String emailId;
    Long customerId;
    String item;

    public OrderRequestDto(String emailId, Long customerId, String item) {
        this.emailId = emailId;
        this.customerId = customerId;
        this.item = item;
    }

    @Override
    public String toString() {
        return "OrderRequestDto{" +
                "emailId='" + emailId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", item='" + item + '\'' +
                '}';
    }
}
