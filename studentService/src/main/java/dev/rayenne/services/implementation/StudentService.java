package dev.rayenne.services.implementation;

import dev.rayenne.dto.ExamResultDto;
import dev.rayenne.dto.GenericResponse;
import dev.rayenne.dto.StudentDto;
import dev.rayenne.mapper.StudentMapper;
import dev.rayenne.repository.StudentRepository;
import dev.rayenne.services.IStudentService;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

@Component
public class StudentService implements IStudentService {

    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;
    private final WebClient webClient= WebClient.builder().baseUrl("http://localhost:8083/api/v1/").build();

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

    @Override
    public List<ExamResultDto> getAllExam(UUID studentId) {
        return webClient.get()
                .uri("examResults/byStudent/"+studentId)
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<GenericResponse<List<ExamResultDto>>>() {})
                .block()
                .data();
    }
}
