package dev.rayenne.controller;

import dev.rayenne.dto.GenericResponse;
import dev.rayenne.dto.TeacherDto;

import java.util.List;
import java.util.UUID;

public interface ITeacherController {

    GenericResponse<List<TeacherDto>>getAllTeacher();
    GenericResponse<TeacherDto>saveTeacher(TeacherDto teacherDto);
    GenericResponse<TeacherDto> updateTeacher(TeacherDto teacherDto, UUID teacherId);
    GenericResponse<TeacherDto> deleteTeacher(UUID teacherId);
}
