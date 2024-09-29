package dev.rayenne.mapper;

import dev.rayenne.dto.ClassRoomDto;
import dev.rayenne.entities.ClassRoom;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring",nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface ClassRoomMapper {

    ClassRoomDto toDto(ClassRoom classRoom);
    ClassRoom toEntity(ClassRoomDto classRoomDto);
    void updateClassRoomMapper(ClassRoomDto classRoomDto, @MappingTarget ClassRoom classRoom);
}
