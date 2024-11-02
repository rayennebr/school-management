package dev.rayenne.controllers.implementation;


import dev.rayenne.controllers.IGradeController;
import dev.rayenne.dto.GenericResponse;
import dev.rayenne.dto.GradeDto;
import dev.rayenne.services.IGradeService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/grade")
@CrossOrigin("*")
public class GradeController implements IGradeController {

    private final IGradeService iGradeService;
    public GradeController(IGradeService iGradeService) {
        this.iGradeService = iGradeService;
    }

    @GetMapping("/")
    @Override
    public GenericResponse<List<GradeDto>> getAllGradeDto() {
        try{
            return GenericResponse.<List<GradeDto>>builder()
                    .status(HttpStatus.OK)
                    .message("success")
                    .data(iGradeService.getAllGrades())
                    .build();
        }catch (Exception e)
        {
            System.err.println(e.getCause());
            return GenericResponse.<List<GradeDto>>builder()
                    .status(HttpStatus.OK)
                    .message("success")
                    .data(null)
                    .build();
        }
    }

    @PostMapping("/")
    @Override
    public GenericResponse<GradeDto> saveGradeDto(@RequestBody GradeDto gradeDto) {
        try{
            return GenericResponse.<GradeDto>builder()
                    .status(HttpStatus.OK)
                    .message("success")
                    .data(iGradeService.saveGrade(gradeDto))
                    .build();
        }catch (Exception e)
        {
            System.err.println(e.getCause());
            return GenericResponse.<GradeDto>builder()
                    .status(HttpStatus.OK)
                    .message("success")
                    .data(null)
                    .build();
        }
    }
}
