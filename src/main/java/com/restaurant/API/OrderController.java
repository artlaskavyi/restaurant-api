package com.restaurant.API;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }
    @GetMapping("/{orderId}/status")
    public OrderStatus getOrderStatusById(@PathVariable long orderId) {
        return orderService.getStatus(orderId);
    }

    @PostMapping
    public Order createOrder(@RequestBody OrderDTO orderDTO) {
        return orderService.createOrder(orderDTO);
    }

}
