package dev.rayenne.mapper;

import dev.rayenne.dto.GradeDto;
import dev.rayenne.entities.Grade;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring",nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface GradeMapper {

    GradeDto toDto(Grade grade);
    Grade toEntity(GradeDto gradeDto);
    void updateMapper(GradeDto gradeDto, @MappingTarget Grade grade);
}
