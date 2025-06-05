package com.restaurant.API;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Order {

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

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public String getAddress() {
        return address;
    }

    public LocalDateTime getOrderedAt() {
        return orderedAt;
    }

    public String getNotes() {
        return notes;
    }

}
