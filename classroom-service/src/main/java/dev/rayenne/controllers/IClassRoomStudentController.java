package dev.rayenne.controllers;

import dev.rayenne.dto.ClassRoomDto;
import dev.rayenne.dto.ClassRoomStudentDto;
import dev.rayenne.dto.GenericResponse;

import java.util.List;

public interface IClassRoomStudentController {

    GenericResponse<List<ClassRoomStudentDto>> getAllClassRoomsStudent();
    GenericResponse<ClassRoomStudentDto>saveClassRoomStudent(ClassRoomStudentDto classRoomDto);

}
