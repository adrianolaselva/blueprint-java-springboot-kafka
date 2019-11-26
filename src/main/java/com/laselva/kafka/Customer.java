package com.laselva.kafka;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Customer {

    private String message;

    public Customer(String message) {
        this.message = message;
    }
}
