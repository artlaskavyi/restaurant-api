package com.restaurant.API;

import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order getOrdeById(long orderId) {
        return orderRepository.findById(orderId).orElse(null);
    }

    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }
}
