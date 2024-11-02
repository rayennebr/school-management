package dev.rayenne.services.implementation;

import dev.rayenne.dto.ClassRoomDto;
import dev.rayenne.mapper.ClassRoomMapper;
import dev.rayenne.repositories.ClassRoomRepository;
import dev.rayenne.services.IClassRoomService;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

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
                classRoomRepository.insert(
                        classRoomMapper.toEntity(
                                classRoomDto
                        )
                )
        );
    }

    @Override
    public ClassRoomDto updateClassRoom(ClassRoomDto classRoomDto, String classRoomId) {
        var classRoomToUpdate=classRoomRepository.findById(classRoomId)
                .orElseThrow(()->new NoSuchElementException("class room n'existe pas"));
        classRoomMapper.updateClassRoomMapper(classRoomDto,classRoomToUpdate);
        classRoomRepository.insert(classRoomToUpdate);
        return classRoomMapper.toDto(
                classRoomToUpdate
        );
    }

    @Override
    public ClassRoomDto deleteClassRoom(String classRoomId) {
        var classRoomToDelete=classRoomRepository.findById(classRoomId)
                .orElseThrow(()->new NoSuchElementException("class room n'existe pas"));
        classRoomRepository.delete(classRoomToDelete);
        return classRoomMapper.toDto(
                classRoomToDelete
        );
    }

    @Override
    public List<ClassRoomDto> getAllByTeacherUid(UUID teacherUid) {
        return classRoomRepository.findAllByTeacherId(teacherUid)
                .stream()
                .map(classRoomMapper::toDto)
                .toList();
    }
}
