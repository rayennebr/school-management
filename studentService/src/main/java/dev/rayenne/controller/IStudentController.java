package dev.rayenne.controller;

import dev.rayenne.dto.ExamResultDto;
import dev.rayenne.dto.GenericResponse;
import dev.rayenne.dto.StudentDto;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public interface IStudentController {

    GenericResponse<List<StudentDto>> getAllStudents();
    GenericResponse<StudentDto> saveStudent(StudentDto studentDto);
    GenericResponse<StudentDto> updateStudent(StudentDto studentDto, UUID studentId);
    GenericResponse<StudentDto> deleteStudent(UUID studentId);
    GenericResponse<List<ExamResultDto>> getAllExam(UUID studentId);
    CompletableFuture<GenericResponse<List<ExamResultDto>>> getStudentExams(UUID studentId);
}
