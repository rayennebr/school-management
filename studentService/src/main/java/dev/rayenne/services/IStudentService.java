package dev.rayenne.services;

import dev.rayenne.dto.StudentDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public interface IStudentService {

    List<StudentDto>getAllStudents();
    StudentDto saveStudent(StudentDto studentDto);
    StudentDto updateStudent(StudentDto studentDto, UUID studentId);
    StudentDto deleteStudent(UUID studentId);
}
