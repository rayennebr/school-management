package dev.rayenne.services.implementation;

import dev.rayenne.dto.ClassRoomStudentDto;
import dev.rayenne.mapper.ClassRoomStudentMapper;
import dev.rayenne.repositories.ClassRoomStudentRepository;
import dev.rayenne.services.IClassRoomStudentService;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.NoSuchElementException;

@Component
public class ClassRoomStudentService implements IClassRoomStudentService {

    private final ClassRoomStudentRepository classRoomStudentRepository;
    private final ClassRoomStudentMapper classRoomStudentMapper;

    public ClassRoomStudentService(ClassRoomStudentRepository classRoomStudentRepository,
                                   ClassRoomStudentMapper classRoomStudentMapper) {
        this.classRoomStudentRepository = classRoomStudentRepository;
        this.classRoomStudentMapper = classRoomStudentMapper;
    }

    @Override
    public List<ClassRoomStudentDto> getAll() {
        return classRoomStudentRepository.findAll()
                .stream()
                .map(classRoomStudentMapper::toDto)
                .toList();
    }

    @Override
    public ClassRoomStudentDto add(ClassRoomStudentDto classRoomStudentDto) {
        return classRoomStudentMapper.toDto(
                classRoomStudentRepository.insert(
                        classRoomStudentMapper.toEntity(
                                classRoomStudentDto
                        )
                )
        );
    }

    @Override
    public ClassRoomStudentDto update(ClassRoomStudentDto classRoomStudentDto, String id) {
        var studentRoomToUpdate=classRoomStudentRepository.findById(id)
                .orElseThrow(()->new NoSuchElementException("element n'existe pas "));
        classRoomStudentMapper.updateMapper(classRoomStudentDto,studentRoomToUpdate);
        classRoomStudentRepository.insert(studentRoomToUpdate);
        return classRoomStudentMapper.toDto(studentRoomToUpdate);
    }

    @Override
    public ClassRoomStudentDto delete(String id) {
        var studentRoomToDelete=classRoomStudentRepository.findById(id)
                .orElseThrow(()->new NoSuchElementException("element n'existe pas "));
        classRoomStudentRepository.delete(studentRoomToDelete);
        return classRoomStudentMapper.toDto(studentRoomToDelete);
    }
}
