package dev.rayenne.controllers.implementation;

import dev.rayenne.controllers.IExamTypeController;
import dev.rayenne.dto.ExamTypeDto;
import dev.rayenne.dto.GenericResponse;
import dev.rayenne.service.IExamTypeService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/examTypes")
@CrossOrigin("*")
public class ExamTypeController implements IExamTypeController {

    private final IExamTypeService examTypeService;

    public ExamTypeController(IExamTypeService examTypeService) {
        this.examTypeService = examTypeService;
    }


    @GetMapping("/")
    @Override
    public GenericResponse<List<ExamTypeDto>> getAllExamTypes() {
        return GenericResponse.<List<ExamTypeDto>>builder()
                .status(HttpStatus.OK)
                .message("success")
                .data(examTypeService.getAllExamType())
                .build();
    }

    @PostMapping("/")
    @Override
    public GenericResponse<ExamTypeDto> saveExamType(@RequestBody ExamTypeDto ExamType) {
        return GenericResponse.<ExamTypeDto>builder()
                .status(HttpStatus.OK)
                .message("success")
                .data(examTypeService.saveExamType(ExamType))
                .build();
    }


    @PutMapping("/{ExamTypeId}")
    @Override
    public GenericResponse<ExamTypeDto> updateExamType(@RequestBody ExamTypeDto ExamTypeDto, @PathVariable UUID ExamTypeId) {
        return GenericResponse.<ExamTypeDto>builder()
                .status(HttpStatus.OK)
                .message("success")
                .data(examTypeService.updateExamType(ExamTypeDto,ExamTypeId))
                .build();
    }

    @DeleteMapping("/{ExamTypeId}")
    @Override
    public GenericResponse<ExamTypeDto> deleteExamType(@PathVariable UUID ExamTypeId) {
        return GenericResponse.<ExamTypeDto>builder()
                .status(HttpStatus.OK)
                .message("success")
                .data(examTypeService.deleteExamType(ExamTypeId))
                .build();
    }
}
