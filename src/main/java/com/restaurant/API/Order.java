package com.restaurant.API;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Order {

    public Order() {}

    public Order(String name, Integer quantity, String address, LocalDateTime orderedAt, String notes) {
        this.name = name;
        this.quantity = quantity;
        this.address = address;
        this.orderedAt = orderedAt;
        this.notes = notes;
    }

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

    public LocalDateTime getOrderedAt() {
        return orderedAt;
    }

}
