package dev.rayenne.dto;

import dev.rayenne.entities.Teacher;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

/**
 * A DTO for the {@link Teacher} entity
 */
public record TeacherDto(UUID teacherId, String fname,
                         String lname, String email,
                         Date dob, char sex, String phone,
                         String address, Date doj) implements Serializable {
}