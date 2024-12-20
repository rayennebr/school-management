package dev.rayenne.service.implementation;

import dev.rayenne.dto.ClassRoomDto;
import dev.rayenne.dto.GenericResponse;
import dev.rayenne.dto.TeacherDto;
import dev.rayenne.mapper.TeacherMapper;
import dev.rayenne.repository.TeacherRepository;
import dev.rayenne.service.ITeacherService;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

@Component
public class TeacherService implements ITeacherService {

    private final TeacherRepository teacherRepository;
    private final TeacherMapper teacherMapper;
    private final WebClient webClient=WebClient.builder().baseUrl("http://localhost:8084/api/v1/classrooms/").build();

    public TeacherService(TeacherRepository teacherRepository, TeacherMapper teacherMapper) {
        this.teacherRepository = teacherRepository;
        this.teacherMapper = teacherMapper;
    }

    @Override
    public List<TeacherDto> getAllTeacher() {
        return teacherRepository.findAll()
                .stream()
                .map(teacherMapper::toDto)
                .toList();
    }

    @Override
    public TeacherDto saveTeacher(TeacherDto teacherDto) {
        return teacherMapper.toDto(
                teacherRepository.save(
                        teacherMapper.toEntity(
                                teacherDto
                        )
                )
        );
    }

    @Override
    public TeacherDto updateTeacher(TeacherDto teacher, UUID teacherId) {
        var teacherToUpdate=teacherRepository.findById(teacherId)
                .orElseThrow(()->new NoSuchElementException("teacher n'existe pas !"));
        teacherMapper.updateMap(teacher,teacherToUpdate);
        return teacherMapper.toDto(
                teacherRepository.saveAndFlush(
                        teacherToUpdate
                )
        );
    }

    @Override
    public TeacherDto deleteTeacher(UUID teacherId) {
        var teacherToDelete=teacherRepository.findById(teacherId)
                .orElseThrow(()->new NoSuchElementException("teacher n'existe pas !"));
        teacherRepository.delete(teacherToDelete);
        return teacherMapper.toDto(teacherToDelete);
    }

    @Override
    public List<ClassRoomDto> getAllClassRooms(UUID teacherId) {
        GenericResponse<List<ClassRoomDto>> response = webClient.get()
                .uri("getAllByTeacherUid/" + teacherId)
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<GenericResponse<List<ClassRoomDto>>>() {})
                .block();
        return response != null ? response.data() : Collections.emptyList(); // Return data or an empty list
    }
}
