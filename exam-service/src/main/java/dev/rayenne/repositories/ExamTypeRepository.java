package dev.rayenne.repositories;

import dev.rayenne.entities.ExamType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ExamTypeRepository extends JpaRepository<ExamType, UUID> {
}
