package dev.rayenne.controllers.implementation;

import dev.rayenne.controllers.ICourseController;
import dev.rayenne.dto.CourseDto;
import dev.rayenne.dto.GenericResponse;
import dev.rayenne.services.ICourseService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/course")
@CrossOrigin("*")
public class CourseController implements ICourseController {

    private final ICourseService courseService;

    public CourseController(ICourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/")
    @Override
    public GenericResponse<List<CourseDto>> getAllCourseDto() {
        try{
            return GenericResponse.<List<CourseDto>>builder()
                    .status(HttpStatus.OK)
                    .message("success")
                    .data(courseService.getAllCourses())
                    .build();
        }catch (Exception e)
        {
            System.err.println(e.getCause());
            return GenericResponse.<List<CourseDto>>builder()
                    .status(HttpStatus.OK)
                    .message("success")
                    .data(null)
                    .build();
        }
    }

    @PostMapping("/")
    @Override
    public GenericResponse<CourseDto> saveCourseDto(@RequestBody CourseDto courseDto) {
        try{
            return GenericResponse.<CourseDto>builder()
                    .status(HttpStatus.OK)
                    .message("success")
                    .data(courseService.saveCourse(courseDto))
                    .build();
        }catch (Exception e)
        {
            System.err.println(e.getCause());
            return GenericResponse.<CourseDto>builder()
                    .status(HttpStatus.OK)
                    .message("success")
                    .data(null)
                    .build();
        }
    }
}
