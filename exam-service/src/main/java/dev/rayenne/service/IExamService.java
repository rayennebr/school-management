package dev.rayenne.service;


import dev.rayenne.dto.ExamDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public interface IExamService {

    List<ExamDto> getAllExams();
    ExamDto saveExam(ExamDto exam);
    ExamDto updateExam(ExamDto ExamDto, UUID examId);
    ExamDto deleteExam(UUID examId);
}
