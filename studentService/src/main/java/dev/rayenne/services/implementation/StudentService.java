package dev.rayenne.services.implementation;

import dev.rayenne.dto.StudentDto;
import dev.rayenne.repository.StudentRepository;
import dev.rayenne.services.IStudentService;

import java.util.List;
import java.util.UUID;

public class StudentService implements IStudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<StudentDto> getAllStudents() {
        return null;
    }

    @Override
    public StudentDto saveStudent(StudentDto studentDto) {
        return null;
    }

    @Override
    public StudentDto updateStudent(StudentDto studentDto, UUID studentId) {
        return null;
    }

    @Override
    public StudentDto deleteStudent(UUID studentId) {
        return null;
    }
}
