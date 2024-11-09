package dev.rayenne.service;


import dev.rayenne.dto.ExamResultDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public interface IExamResultService {

    List<ExamResultDto> getAllExamResult();
    ExamResultDto saveExamResult(ExamResultDto exam);
    ExamResultDto updateExamResult(ExamResultDto ExamResultDto, UUID examId);
    ExamResultDto deleteExamResult(UUID examId);
    List<ExamResultDto>listExamResultBuStudent(UUID studentUid);
}
