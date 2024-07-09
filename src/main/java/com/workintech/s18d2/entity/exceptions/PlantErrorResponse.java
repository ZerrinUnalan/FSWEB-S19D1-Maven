package com.workintech.s18d2.entity.exceptions;

import java.time.LocalDateTime;

public record PlantErrorResponse(Integer status, String message, LocalDateTime dateTime) {
}