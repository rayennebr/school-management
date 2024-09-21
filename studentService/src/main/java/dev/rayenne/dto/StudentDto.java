package dev.rayenne.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

/**
 * A DTO for the {@link dev.rayenne.entitiy.Student} entity
 */
public record StudentDto(UUID studentId, String fname, String lname, String email, Date dob, String phone,
                         Date dateOfJoin, String status, Date lastLoginDate, Date createdAt, Date modifiedAt,
                         UUID parentId) implements Serializable {
}