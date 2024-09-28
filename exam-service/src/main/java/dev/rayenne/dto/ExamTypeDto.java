package dev.rayenne.dto;

import java.io.Serializable;
import java.util.UUID;

/**
 * A DTO for the {@link dev.rayenne.entities.ExamType} entity
 */
public record ExamTypeDto(UUID examTypeId, String name, String des) implements Serializable {
}