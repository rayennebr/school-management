package dev.rayenne.dto;

import java.io.Serializable;
import java.util.UUID;

/**
 * A DTO for the {@link dev.rayenne.entities.ExamResult} entity
 */
public record ExamResultDto(UUID examResultId, UUID studentId, UUID courseId, UUID examId,
                            Long marks) implements Serializable {
}