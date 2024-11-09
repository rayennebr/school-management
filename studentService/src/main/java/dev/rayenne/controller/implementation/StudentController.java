package dev.rayenne.controller.implementation;

import dev.rayenne.controller.IStudentController;
import dev.rayenne.dto.ExamResultDto;
import dev.rayenne.dto.GenericResponse;
import dev.rayenne.dto.StudentDto;
import dev.rayenne.services.IStudentService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import io.github.resilience4j.timelimiter.annotation.TimeLimiter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/api/v1/students")
@CrossOrigin("*")
public class StudentController implements IStudentController {

    private final IStudentService studentService;

    public StudentController(IStudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/")
    @Override
    public GenericResponse<List<StudentDto>> getAllStudents() {
        return new GenericResponse<>(HttpStatus.OK,
                "success",
                studentService.getAllStudents());
    }

    @PostMapping("/")
    @Override
    public GenericResponse<StudentDto> saveStudent(@RequestBody StudentDto studentDto) {
        return new GenericResponse<>(HttpStatus.OK,
                "success",
                studentService.saveStudent(studentDto));
    }

    @PutMapping("/{studentId}")
    @Override
    public GenericResponse<StudentDto> updateStudent(@RequestBody StudentDto studentDto,
                                                     @PathVariable UUID studentId) {
        return new GenericResponse<>(HttpStatus.OK,
                "success",
                studentService.updateStudent(studentDto,studentId));
    }

    @DeleteMapping("/{studentId}")
    @Override
    public GenericResponse<StudentDto> deleteStudent(@PathVariable UUID studentId) {
        return new GenericResponse<>(HttpStatus.OK,
                "success",
                studentService.deleteStudent(studentId));
    }

    @GetMapping("/exam/{studentId}")
    @Override
    public GenericResponse<List<ExamResultDto>> getAllExam(@PathVariable UUID studentId) {
        return new GenericResponse<>(HttpStatus.OK,
                "success",
                studentService.getAllExam(studentId));
    }

    @GetMapping("/studentExam/{studentId}")
    @CircuitBreaker(name = "exam",fallbackMethod = "fallBackMethod")
    @TimeLimiter(name = "exam")
    @Retry(name = "exam")
    @Override
    public CompletableFuture<GenericResponse<List<ExamResultDto>>> getStudentExams(@PathVariable UUID studentId) {
        System.out.println("exams loaded !");
        return CompletableFuture.supplyAsync(()->new GenericResponse<>(HttpStatus.OK,
                "success",
                studentService.getAllExam(studentId)));
    }

    public CompletableFuture<GenericResponse<List<ExamResultDto>>> fallBackMethod(@PathVariable UUID studentId,
            RuntimeException runtimeException) {
        System.out.println("exams loaded !");
        return CompletableFuture.supplyAsync(()->new GenericResponse<>(HttpStatus.NO_CONTENT,
                "something wrong ! try later !",
                null));
    }
}
