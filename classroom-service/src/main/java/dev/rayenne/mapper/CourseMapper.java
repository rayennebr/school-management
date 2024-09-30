package dev.rayenne.mapper;

import dev.rayenne.dto.CourseDto;
import dev.rayenne.entities.Course;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring",nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface CourseMapper {

    CourseDto toDto(Course course);
    Course toEntity(CourseDto courseDto);
    void updateMapper(CourseDto courseDto, @MappingTarget Course course);
}
