package dev.rayenne.dto;

import java.util.UUID;

public record ParentDto(
        UUID parentId,
        String email,
        String password,
        String firstnameF,
        String lastenameF,
        String firstnameM,
        String lastnameM,
        String phone,
        String status
        ) {
}
