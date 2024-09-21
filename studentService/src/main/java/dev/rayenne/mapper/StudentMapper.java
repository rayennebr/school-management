package dev.rayenne.mapper;

import dev.rayenne.dto.StudentDto;
import dev.rayenne.entitiy.Student;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface StudentMapper {

    StudentDto toDto(Student student);
    Student toEntity(StudentDto studentDto);
    void updateMapper(StudentDto studentDto,@MappingTarget Student student);
}
