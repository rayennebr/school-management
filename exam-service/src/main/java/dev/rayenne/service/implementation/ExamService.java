package dev.rayenne.service.implementation;

import dev.rayenne.dto.ExamDto;
import dev.rayenne.mapper.ExamMapper;
import dev.rayenne.repositories.ExamRepository;
import dev.rayenne.service.IExamService;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

@Component
public class ExamService implements IExamService {

    private final ExamRepository examRepository;
    private final ExamMapper examMapper;

    public ExamService(ExamRepository examRepository, ExamMapper examMapper) {
        this.examRepository = examRepository;
        this.examMapper = examMapper;
    }

    @Override
    public List<ExamDto> getAllExams() {
        return examRepository.findAll()
                .stream()
                .map(examMapper::toDto)
                .toList();
    }

    @Override
    public ExamDto saveExam(ExamDto exam) {
        return examMapper.toDto(
                examRepository.save(
                        examMapper.toEntity(
                                exam
                        )
                )
        );
    }

    @Override
    public ExamDto updateExam(ExamDto examDto, UUID examId) {
        var examToUpdate=examRepository.findById(examId)
                .orElseThrow(()->new NoSuchElementException("exam n'existe pas !"));
        examMapper.updateMapper(examDto,examToUpdate);
        return examMapper.toDto(examToUpdate);
    }

    @Override
    public ExamDto deleteExam(UUID examId) {
        var examToDelete=examRepository.findById(examId)
                .orElseThrow(()->new NoSuchElementException("exam n'existe pas !"));
        examRepository.delete(examToDelete);
        return examMapper.toDto(examToDelete);
    }
}
