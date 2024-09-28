package dev.rayenne.mapper;

import dev.rayenne.dto.ExamTypeDto;
import dev.rayenne.entities.ExamType;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring",nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface ExamTypeMapper {

    ExamType toEntity(ExamTypeDto ExamTypeDto);
    ExamTypeDto toDto(ExamType ExamType);
    void updateMapper(ExamTypeDto ExamTypeDto, @MappingTarget ExamType ExamType);
    
}
