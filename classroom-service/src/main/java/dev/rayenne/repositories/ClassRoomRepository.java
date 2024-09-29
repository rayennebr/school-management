package dev.rayenne.repositories;


import dev.rayenne.entities.ClassRoom;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClassRoomRepository extends MongoRepository<ClassRoom,String> {
}
