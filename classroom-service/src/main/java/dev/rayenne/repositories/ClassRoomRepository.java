package dev.rayenne.repositories;


import dev.rayenne.entities.ClassRoom;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.UUID;

public interface ClassRoomRepository extends MongoRepository<ClassRoom,String> {

    List<ClassRoom> findAllByTeacherId(UUID teacherId);
}
