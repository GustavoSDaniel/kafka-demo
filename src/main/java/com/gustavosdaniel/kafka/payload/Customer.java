package com.gustavosdaniel.kafka.payload;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Customer {

    private Integer id;
    private String lastName;
    private String firstName;
}
