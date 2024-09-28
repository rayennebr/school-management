package dev.rayenne.service;

import dev.rayenne.dto.ExamTypeDto;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.UUID;

@Service
public interface IExamTypeService {

    List<ExamTypeDto>getAllExamType();
    ExamTypeDto saveExamType(ExamTypeDto exam);
    ExamTypeDto updateExamType(ExamTypeDto examTypeDto, UUID examId);
    ExamTypeDto deleteExamType(UUID examId);
}
