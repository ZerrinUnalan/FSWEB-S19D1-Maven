package com.workintech.s18d2.controller.dto;

import com.workintech.s18d2.entity.Fruit;

public record FruitResponse(String message, Fruit fruit) {
}