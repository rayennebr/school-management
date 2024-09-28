package dev.rayenne.mapper;

import dev.rayenne.dto.ExamDto;
import dev.rayenne.entities.Exam;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring",nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface ExamMapper {
    Exam toEntity(ExamDto examDto);
    ExamDto toDto(Exam exam);
    void updateMapper(ExamDto examDto, @MappingTarget Exam exam);
}
