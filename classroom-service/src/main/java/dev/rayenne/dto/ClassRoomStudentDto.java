package dev.rayenne.dto;

import lombok.Builder;

import java.util.UUID;

@Builder
public record ClassRoomStudentDto(
        String classroomStudentId,
        String classroomId,
        UUID studentId
) {
}
