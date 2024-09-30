package dev.rayenne.repositories;

import dev.rayenne.entities.ClassRoomStudent;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClassRoomStudentRepository extends MongoRepository<ClassRoomStudent,String> {
}
