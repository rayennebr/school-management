package dev.rayenne.services.implementation;

import dev.rayenne.dto.GradeDto;
import dev.rayenne.mapper.GradeMapper;
import dev.rayenne.repositories.GradeRepository;
import dev.rayenne.services.IGradeService;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.NoSuchElementException;

@Component
public class GradeService implements IGradeService {

    private final GradeRepository gradeRepository;
    private final GradeMapper gradeMapper;

    public GradeService(GradeRepository gradeRepository, GradeMapper gradeMapper) {
        this.gradeRepository = gradeRepository;
        this.gradeMapper = gradeMapper;
    }

    @Override
    public List<GradeDto> getAllGrades() {
        return gradeRepository.findAll()
                .stream()
                .map(gradeMapper::toDto)
                .toList();
    }

    @Override
    public GradeDto saveGrade(GradeDto gradeDto) {
        return gradeMapper.toDto(
                gradeRepository.save(
                        gradeMapper.toEntity(
                                gradeDto
                        )
                )
        );
    }

    @Override
    public GradeDto updateGrade(GradeDto gradeDto, String gradeId) {
        var gradeToUpdate=gradeRepository.findById(gradeId)
                .orElseThrow(()-> new NoSuchElementException("grade n'existe pas"));
        gradeMapper.updateMapper(gradeDto,gradeToUpdate);
        gradeRepository.insert(gradeToUpdate);
        return gradeMapper.toDto(gradeToUpdate);
    }

    @Override
    public GradeDto deleteGrade(String gradeId) {
        var gradeToDelete=gradeRepository.findById(gradeId)
                .orElseThrow(()-> new NoSuchElementException("grade n'existe pas"));
        gradeRepository.delete(gradeToDelete);
        return gradeMapper.toDto(gradeToDelete);
    }
}
