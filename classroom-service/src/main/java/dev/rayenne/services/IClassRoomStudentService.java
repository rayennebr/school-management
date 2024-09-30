package dev.rayenne.services;

import dev.rayenne.dto.ClassRoomStudentDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IClassRoomStudentService {
    List<ClassRoomStudentDto>getAll();
    ClassRoomStudentDto add(ClassRoomStudentDto classRoomStudentDto);
    ClassRoomStudentDto update(ClassRoomStudentDto classRoomStudentDto ,String id);
    ClassRoomStudentDto delete(String id);
}
