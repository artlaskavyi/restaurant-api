package com.restaurant.API;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Order {

    public Order() {}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100,nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer quantity;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private LocalDateTime orderedAt;

    @Column(length = 200)
    private String notes;

    @Column(nullable = false)
    private OrderStatus status;

    public OrderStatus getStatus() {
        return status;
    }
}
