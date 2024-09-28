package dev.rayenne.service.implementation;

import dev.rayenne.dto.ExamTypeDto;
import dev.rayenne.mapper.ExamTypeMapper;
import dev.rayenne.repositories.ExamTypeRepository;
import dev.rayenne.service.IExamTypeService;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

public class ExamTypeService implements IExamTypeService {

    private final ExamTypeRepository ExamTypeRepository;
    private final ExamTypeMapper ExamTypeMapper;

    public ExamTypeService(ExamTypeRepository ExamTypeRepository, ExamTypeMapper ExamTypeMapper) {
        this.ExamTypeRepository = ExamTypeRepository;
        this.ExamTypeMapper = ExamTypeMapper;
    }

    @Override
    public List<ExamTypeDto> getAllExamType() {
        return ExamTypeRepository.findAll()
                .stream()
                .map(ExamTypeMapper::toDto)
                .toList();
    }

    @Override
    public ExamTypeDto saveExamType(ExamTypeDto ExamType) {
        return ExamTypeMapper.toDto(
                ExamTypeRepository.save(
                        ExamTypeMapper.toEntity(
                                ExamType
                        )
                )
        );
    }

    @Override
    public ExamTypeDto updateExamType(ExamTypeDto ExamTypeDto, UUID ExamTypeId) {
        var ExamTypeToUpdate=ExamTypeRepository.findById(ExamTypeId)
                .orElseThrow(()->new NoSuchElementException("ExamType n'existe pas !"));
        ExamTypeMapper.updateMapper(ExamTypeDto,ExamTypeToUpdate);
        return ExamTypeMapper.toDto(ExamTypeToUpdate);
    }

    @Override
    public ExamTypeDto deleteExamType(UUID ExamTypeId) {
        var ExamTypeToDelete=ExamTypeRepository.findById(ExamTypeId)
                .orElseThrow(()->new NoSuchElementException("ExamType n'existe pas !"));
        ExamTypeRepository.delete(ExamTypeToDelete);
        return ExamTypeMapper.toDto(ExamTypeToDelete);
    }
}
