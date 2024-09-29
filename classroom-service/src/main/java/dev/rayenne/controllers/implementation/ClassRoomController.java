package dev.rayenne.controllers.implementation;

import dev.rayenne.controllers.IClassRoomController;
import dev.rayenne.dto.ClassRoomDto;
import dev.rayenne.dto.GenericResponse;
import dev.rayenne.services.IClassRoomService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/classrooms")
@CrossOrigin("*")
public class ClassRoomController implements IClassRoomController {

    private final IClassRoomService classRoomService;

    public ClassRoomController(IClassRoomService classRoomService) {
        this.classRoomService = classRoomService;
    }

    @GetMapping("/")
    @Override
    public GenericResponse<List<ClassRoomDto>> getAllClassRooms() {
        return GenericResponse.<List<ClassRoomDto>>builder()
                .status(HttpStatus.OK)
                .message("success")
                .data(classRoomService.getAllClassRooms())
                .build();
    }

    @PostMapping("/")
    @Override
    public GenericResponse<ClassRoomDto> saveClassRoom(@RequestBody ClassRoomDto classRoomDto) {
       try{
           return GenericResponse.<ClassRoomDto>builder()
                   .status(HttpStatus.OK)
                   .message("success")
                   .data(classRoomService.saveClassRoom(classRoomDto))
                   .build();
       }catch (Exception e)
       {
           System.err.println(e.getCause());
           return GenericResponse.<ClassRoomDto>builder()
                   .status(HttpStatus.OK)
                   .message("success")
                   .data(null)
                   .build();
       }
    }
}
