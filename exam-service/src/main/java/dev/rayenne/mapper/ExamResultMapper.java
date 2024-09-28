package dev.rayenne.mapper;

import dev.rayenne.dto.ExamResultDto;
import dev.rayenne.entities.ExamResult;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring",nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface ExamResultMapper {

    ExamResult toEntity(ExamResultDto ExamResultDto);
    ExamResultDto toDto(ExamResult ExamResult);
    void updateMapper(ExamResultDto ExamResultDto, @MappingTarget ExamResult ExamResult);
}
