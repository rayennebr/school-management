package dev.rayenne.mapper;

import dev.rayenne.dto.TeacherDto;
import dev.rayenne.entities.Teacher;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring",nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface TeacherMapper {

    TeacherDto toDto(Teacher teacher);
    Teacher toEntity(TeacherDto teacherDto);
    void updateMap(TeacherDto teacherDto, @MappingTarget Teacher teacher);
}
