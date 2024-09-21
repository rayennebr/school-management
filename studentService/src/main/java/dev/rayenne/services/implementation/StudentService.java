package dev.rayenne.services.implementation;

import dev.rayenne.dto.StudentDto;
import dev.rayenne.mapper.StudentMapper;
import dev.rayenne.repository.StudentRepository;
import dev.rayenne.services.IStudentService;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

@Component
public class StudentService implements IStudentService {

    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;

    public StudentService(StudentRepository studentRepository,
                          StudentMapper studentMapper)
    {
        this.studentRepository = studentRepository;
        this.studentMapper = studentMapper;
    }

    @Override
    public List<StudentDto> getAllStudents() {

        return studentRepository.findAll()
                .stream()
                .map(studentMapper::toDto)
                .toList();
    }

    @Override
    public StudentDto saveStudent(StudentDto studentDto) {
        return studentMapper.toDto(
                studentRepository.save(
                        studentMapper.toEntity(studentDto)
                ));
    }

    @Override
    public StudentDto updateStudent(StudentDto studentDto, UUID studentId) {
        var studentToUpdate=studentRepository.findById(studentId)
                .orElseThrow(()->new NoSuchElementException(" student n'existe pas !"));
        studentMapper.updateMapper(studentDto,studentToUpdate);
        return studentMapper.toDto(studentRepository.saveAndFlush(studentToUpdate));
    }

    @Override
    public StudentDto deleteStudent(UUID studentId) {
        var studentToDelete=studentRepository.findById(studentId)
                .orElseThrow(()->new NoSuchElementException(" student n'existe pas !"));
        studentRepository.delete(studentToDelete);
        return studentMapper.toDto(studentToDelete);
    }
}
