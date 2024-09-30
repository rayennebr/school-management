package dev.rayenne.repositories;

import dev.rayenne.entities.Grade;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GradeRepository extends MongoRepository<Grade,String> {
}
