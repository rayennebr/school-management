package dev.rayenne.service;

import dev.rayenne.dto.ClassRoomDto;
import dev.rayenne.dto.TeacherDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public interface ITeacherService {

    List<TeacherDto> getAllTeacher();
    TeacherDto saveTeacher(TeacherDto teacherDto);
    TeacherDto updateTeacher(TeacherDto teacher, UUID teacherId);
    TeacherDto deleteTeacher(UUID teacherId);
    List<ClassRoomDto> getAllClassRooms(UUID teacherId);
}
