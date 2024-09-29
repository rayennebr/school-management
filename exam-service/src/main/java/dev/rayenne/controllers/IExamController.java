package dev.rayenne.controllers;

import dev.rayenne.dto.ExamDto;
import dev.rayenne.dto.GenericResponse;

import java.util.List;
import java.util.UUID;

public interface IExamController {

    GenericResponse<List<ExamDto>> getAllExams();
    GenericResponse<ExamDto> saveExam(ExamDto exam);
    GenericResponse<ExamDto> updateExam(ExamDto ExamDto, UUID examId);
    GenericResponse<ExamDto> deleteExam(UUID examId);
}
