package dev.rayenne.controllers;

import dev.rayenne.dto.ExamResultDto;
import dev.rayenne.dto.GenericResponse;

import java.util.List;
import java.util.UUID;

public interface IExamResultController {

    GenericResponse<List<ExamResultDto>> getAllExamResults();
    GenericResponse<ExamResultDto> saveExamResult(ExamResultDto ExamResult);
    GenericResponse<ExamResultDto> updateExamResult(ExamResultDto ExamResultDto, UUID ExamResultId);
    GenericResponse<ExamResultDto> deleteExamResult(UUID ExamResultId);
    GenericResponse<List<ExamResultDto>>listExamResultBuStudent(UUID studentUid);
}
