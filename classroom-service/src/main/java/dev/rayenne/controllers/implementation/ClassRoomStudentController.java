package dev.rayenne.controllers.implementation;


import dev.rayenne.controllers.IClassRoomStudentController;
import dev.rayenne.dto.ClassRoomStudentDto;
import dev.rayenne.dto.GenericResponse;
import dev.rayenne.services.IClassRoomStudentService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/classstudent")
public class ClassRoomStudentController implements IClassRoomStudentController {

    private final IClassRoomStudentService studentService;

    public ClassRoomStudentController(IClassRoomStudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/")
    @Override
    public GenericResponse<List<ClassRoomStudentDto>> getAllClassRoomsStudent() {
        return GenericResponse.<List<ClassRoomStudentDto>>builder()
                .status(HttpStatus.OK)
                .message("success")
                .data(studentService.getAll())
                .build();
    }

    @PostMapping("/")
    @Override
    public GenericResponse<ClassRoomStudentDto> saveClassRoomStudent(@RequestBody ClassRoomStudentDto classRoomDto) {
        try{
            return GenericResponse.<ClassRoomStudentDto>builder()
                    .status(HttpStatus.OK)
                    .message("success")
                    .data(studentService.add(classRoomDto))
                    .build();
        }catch (Exception e)
        {
            System.err.println(e.getCause());
            return GenericResponse.<ClassRoomStudentDto>builder()
                    .status(HttpStatus.OK)
                    .message("success")
                    .data(null)
                    .build();
        }
    }
}
