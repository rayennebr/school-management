package dev.rayenne.controllers;

import dev.rayenne.dto.CourseDto;
import dev.rayenne.dto.GenericResponse;
import dev.rayenne.dto.GradeDto;

import java.util.List;

public interface IGradeController {

    GenericResponse<List<GradeDto>> getAllGradeDto();
    GenericResponse<GradeDto>saveGradeDto(GradeDto gradeDto);

}
