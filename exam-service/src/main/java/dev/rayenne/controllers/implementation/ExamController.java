package dev.rayenne.controllers.implementation;

import dev.rayenne.controllers.IExamController;
import dev.rayenne.dto.ExamDto;
import dev.rayenne.dto.GenericResponse;
import dev.rayenne.service.IExamService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/exams")
@CrossOrigin("*")
public class ExamController implements IExamController {

    private final IExamService examService;

    public ExamController(IExamService examService) {
        this.examService = examService;
    }


    @GetMapping("/")
    @Override
    public GenericResponse<List<ExamDto>> getAllExams() {
        return GenericResponse.<List<ExamDto>>builder()
                .status(HttpStatus.OK)
                .message("success")
                .data(examService.getAllExams())
                .build();
    }

    @PostMapping("/")
    @Override
    public GenericResponse<ExamDto> saveExam(@RequestBody ExamDto exam) {
        return GenericResponse.<ExamDto>builder()
                .status(HttpStatus.OK)
                .message("success")
                .data(examService.saveExam(exam))
                .build();
    }


    @PutMapping("/{examId}")
    @Override
    public GenericResponse<ExamDto> updateExam(@RequestBody ExamDto examDto, @PathVariable UUID examId) {
        return GenericResponse.<ExamDto>builder()
                .status(HttpStatus.OK)
                .message("success")
                .data(examService.updateExam(examDto,examId))
                .build();
    }

    @DeleteMapping("/{examId}")
    @Override
    public GenericResponse<ExamDto> deleteExam(@PathVariable UUID examId) {
        return GenericResponse.<ExamDto>builder()
                .status(HttpStatus.OK)
                .message("success")
                .data(examService.deleteExam(examId))
                .build();
    }
}
