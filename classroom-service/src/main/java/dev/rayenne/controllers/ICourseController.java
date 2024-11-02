package dev.rayenne.controllers;

import dev.rayenne.dto.ClassRoomStudentDto;
import dev.rayenne.dto.CourseDto;
import dev.rayenne.dto.GenericResponse;

import java.util.List;

public interface ICourseController {

    GenericResponse<List<CourseDto>> getAllCourseDto();
    GenericResponse<CourseDto>saveCourseDto(CourseDto courseDto);

}
