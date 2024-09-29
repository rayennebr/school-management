package dev.rayenne.services.implementation;

import dev.rayenne.dto.ClassRoomDto;
import dev.rayenne.mapper.ClassRoomMapper;
import dev.rayenne.repositories.ClassRoomRepository;
import dev.rayenne.services.IClassRoomService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClassRoomService implements IClassRoomService {

    private final ClassRoomRepository classRoomRepository;
    private final ClassRoomMapper classRoomMapper;

    public ClassRoomService(ClassRoomRepository classRoomRepository,
                            ClassRoomMapper classRoomMapper) {
        this.classRoomRepository = classRoomRepository;
        this.classRoomMapper = classRoomMapper;
    }

    @Override
    public List<ClassRoomDto> getAllClassRooms() {
        return classRoomRepository.findAll()
                .stream()
                .map(classRoomMapper::toDto)
                .toList();
    }

    @Override
    public ClassRoomDto saveClassRoom(ClassRoomDto classRoomDto) {
        return classRoomMapper.toDto(
                classRoomRepository.save(
                        classRoomMapper.toEntity(
                                classRoomDto
                        )
                )
        );
    }

    @Override
    public ClassRoomDto updateClassRoom(ClassRoomDto classRoomDto, String classRoomId) {
        return null;
    }

    @Override
    public ClassRoomDto deleteClassRoom(String classRoomId) {
        return null;
    }
}
