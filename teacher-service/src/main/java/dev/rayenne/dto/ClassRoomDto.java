package dev.rayenne.dto;

import lombok.Builder;

import java.util.UUID;

@Builder
public record ClassRoomDto(String classRoomId,
                           UUID teacherId,
                           String gradeId,
                           String section,
                           int status,
                           String remarks) {
}
