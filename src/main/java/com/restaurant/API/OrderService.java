package com.restaurant.API;

import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public OrderStatus getStatus(long orderId) {
        Order order = orderRepository.findById(orderId).orElse(null);

        LocalDateTime orderedAt = order.getOrderedAt();
        LocalDateTime now = LocalDateTime.now();
        Duration duration = Duration.between(orderedAt, now);

        if (duration.toMinutes() > 2) {
            return OrderStatus.DELIVERED;
        } else {
            return OrderStatus.ORDERED;
        }
    }

    public Order createOrder(OrderDTO orderDTO) {
        Order newOrder = new Order(
                orderDTO.name(),
                orderDTO.quantity(),
                orderDTO.adress(),
                LocalDateTime.now(),
                orderDTO.notes()
        );
        return orderRepository.save(newOrder);
    }
}
