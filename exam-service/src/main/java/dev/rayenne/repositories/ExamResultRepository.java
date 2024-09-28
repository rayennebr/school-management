package dev.rayenne.repositories;

import dev.rayenne.entities.ExamResult;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ExamResultRepository extends JpaRepository<ExamResult, UUID> {
}
