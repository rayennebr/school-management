package dev.rayenne.controllers;

import dev.rayenne.dto.ClassRoomDto;
import dev.rayenne.dto.GenericResponse;

import java.util.List;

public interface IClassRoomController {

    GenericResponse<List<ClassRoomDto>>getAllClassRooms();
    GenericResponse<ClassRoomDto>saveClassRoom(ClassRoomDto classRoomDto);
}
