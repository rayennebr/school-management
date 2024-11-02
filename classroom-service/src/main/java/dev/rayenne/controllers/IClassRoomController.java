package dev.rayenne.controllers;

import dev.rayenne.dto.ClassRoomDto;
import dev.rayenne.dto.GenericResponse;

import java.util.List;
import java.util.UUID;

public interface IClassRoomController {

    GenericResponse<List<ClassRoomDto>>getAllClassRooms();
    GenericResponse<ClassRoomDto>saveClassRoom(ClassRoomDto classRoomDto);
    GenericResponse<List<ClassRoomDto>> getAllByTeacherUid(UUID teacherUid);
}
