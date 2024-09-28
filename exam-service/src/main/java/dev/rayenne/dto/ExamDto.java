package dev.rayenne.dto;

import java.io.Serializable;
import java.sql.Date;
import java.util.UUID;

/**
 * A DTO for the {@link dev.rayenne.entities.Exam} entity
 */
public record ExamDto(UUID examId, UUID examTypeId, String name, Date startDate) implements Serializable {
}