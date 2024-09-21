package dev.rayenne.controller.implementation;

import dev.rayenne.controller.IStudentController;
import dev.rayenne.dto.GenericResponse;
import dev.rayenne.dto.StudentDto;
import dev.rayenne.services.IStudentService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

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
}
