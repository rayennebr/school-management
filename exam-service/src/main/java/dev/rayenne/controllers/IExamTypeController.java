package dev.rayenne.controllers;

import dev.rayenne.dto.ExamTypeDto;
import dev.rayenne.dto.GenericResponse;

import java.util.List;
import java.util.UUID;

public interface IExamTypeController {

    GenericResponse<List<ExamTypeDto>> getAllExamTypes();
    GenericResponse<ExamTypeDto> saveExamType(ExamTypeDto ExamType);
    GenericResponse<ExamTypeDto> updateExamType(ExamTypeDto ExamTypeDto, UUID ExamTypeId);
    GenericResponse<ExamTypeDto> deleteExamType(UUID ExamTypeId);
}
