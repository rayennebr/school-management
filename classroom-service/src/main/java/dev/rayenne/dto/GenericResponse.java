package dev.rayenne.dto;

import lombok.Builder;
import org.springframework.http.HttpStatus;

@Builder
public record GenericResponse<T>(HttpStatus status,
                                 String message,
                                 T data) {
}
