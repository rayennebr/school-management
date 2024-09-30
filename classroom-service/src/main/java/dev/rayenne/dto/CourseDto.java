package dev.rayenne.dto;

import lombok.Builder;

@Builder
public record CourseDto(String courseId,
                        String gradeId,
                        String name,
                        String des) {
}
