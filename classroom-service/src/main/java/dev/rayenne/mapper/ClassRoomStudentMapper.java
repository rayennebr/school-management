package dev.rayenne.mapper;

import dev.rayenne.dto.ClassRoomStudentDto;
import dev.rayenne.entities.ClassRoomStudent;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring",nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface ClassRoomStudentMapper {

    ClassRoomStudentDto toDto(ClassRoomStudent classRoomStudent);
    ClassRoomStudent toEntity(ClassRoomStudentDto classRoomStudentDto);
    void updateMapper(ClassRoomStudentDto classRoomStudentDto, @MappingTarget ClassRoomStudent classRoomStudent);
}
