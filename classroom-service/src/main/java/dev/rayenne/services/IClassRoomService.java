package dev.rayenne.services;

import dev.rayenne.dto.ClassRoomDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IClassRoomService {

    List<ClassRoomDto>getAllClassRooms();
    ClassRoomDto saveClassRoom(ClassRoomDto classRoomDto);
    ClassRoomDto updateClassRoom(ClassRoomDto classRoomDto,String classRoomId);
    ClassRoomDto deleteClassRoom(String classRoomId);
}
