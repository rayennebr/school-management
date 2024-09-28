package dev.rayenne.controller.implementation;

import dev.rayenne.controller.ITeacherController;
import dev.rayenne.dto.GenericResponse;
import dev.rayenne.dto.TeacherDto;
import dev.rayenne.service.ITeacherService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/teacher")
@CrossOrigin("*")
public class TeacherController implements ITeacherController {

    private final ITeacherService teacherService;

    public TeacherController(ITeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @Override
    @GetMapping("/")
    public GenericResponse<List<TeacherDto>> getAllTeacher() {
        return GenericResponse.<List<TeacherDto>>builder()
                .status(HttpStatus.OK)
                .message("success")
                .data(teacherService.getAllTeacher())
                .build();
    }

    @Override
    @PostMapping("/")
    public GenericResponse<TeacherDto> saveTeacher(@RequestBody TeacherDto teacherDto) {
        return GenericResponse.<TeacherDto>builder()
                .status(HttpStatus.OK)
                .message("success")
                .data(teacherService.saveTeacher(teacherDto))
                .build();
    }

    @Override
    @PutMapping("/{teacherId}")
    public GenericResponse<TeacherDto> updateTeacher(@RequestBody TeacherDto teacherDto,
                                                     @PathVariable UUID teacherId) {
        return GenericResponse.<TeacherDto>builder()
                .status(HttpStatus.OK)
                .message("success")
                .data(teacherService.updateTeacher(teacherDto,teacherId))
                .build();
    }

    @Override
    @DeleteMapping("/{teacherId}")
    public GenericResponse<TeacherDto> deleteTeacher(@PathVariable UUID teacherId) {
        return GenericResponse.<TeacherDto>builder()
                .status(HttpStatus.OK)
                .message("success")
                .data(teacherService.deleteTeacher(teacherId))
                .build();
    }
}
