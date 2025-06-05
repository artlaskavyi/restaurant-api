package com.restaurant.API;

public record OrderDTO(
        String name,
        Integer quantity,
        String adress,
        String notes
) { }
