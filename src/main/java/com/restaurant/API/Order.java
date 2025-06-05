package com.restaurant.API;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "customer_order")
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

    public String getNotes() {
        return notes;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setOrderedAt(LocalDateTime orderedAt) {
        this.orderedAt = orderedAt;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
