package dev.rayenne.service.implementation;

import dev.rayenne.dto.ExamResultDto;
import dev.rayenne.mapper.ExamResultMapper;
import dev.rayenne.repositories.ExamResultRepository;
import dev.rayenne.service.IExamResultService;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

@Component
public class ExamResultService implements IExamResultService {

    private final ExamResultRepository ExamResultRepository;
    private final ExamResultMapper ExamResultMapper;

    public ExamResultService(ExamResultRepository ExamResultRepository, ExamResultMapper ExamResultMapper) {
        this.ExamResultRepository = ExamResultRepository;
        this.ExamResultMapper = ExamResultMapper;
    }

    @Override
    public List<ExamResultDto> getAllExamResult() {
        return ExamResultRepository.findAll()
                .stream()
                .map(ExamResultMapper::toDto)
                .toList();
    }

    @Override
    public ExamResultDto saveExamResult(ExamResultDto ExamResult) {
        return ExamResultMapper.toDto(
                ExamResultRepository.save(
                        ExamResultMapper.toEntity(
                                ExamResult
                        )
                )
        );
    }

    @Override
    public ExamResultDto updateExamResult(ExamResultDto ExamResultDto, UUID ExamResultId) {
        var ExamResultToUpdate=ExamResultRepository.findById(ExamResultId)
                .orElseThrow(()->new NoSuchElementException("ExamResult n'existe pas !"));
        ExamResultMapper.updateMapper(ExamResultDto,ExamResultToUpdate);
        return ExamResultMapper.toDto(ExamResultToUpdate);
    }

    @Override
    public ExamResultDto deleteExamResult(UUID ExamResultId) {
        var ExamResultToDelete=ExamResultRepository.findById(ExamResultId)
                .orElseThrow(()->new NoSuchElementException("ExamResult n'existe pas !"));
        ExamResultRepository.delete(ExamResultToDelete);
        return ExamResultMapper.toDto(ExamResultToDelete);
    }
}
