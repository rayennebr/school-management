package dev.rayenne.dto;

import lombok.Builder;

@Builder
public record GradeDto(String gradeId,
                       String name,
                       String des) {
}
