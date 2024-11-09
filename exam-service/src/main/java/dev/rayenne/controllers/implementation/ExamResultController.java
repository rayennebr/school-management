package dev.rayenne.controllers.implementation;

import dev.rayenne.controllers.IExamResultController;
import dev.rayenne.dto.ExamResultDto;
import dev.rayenne.dto.GenericResponse;
import dev.rayenne.service.IExamResultService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/examResults")
@CrossOrigin("*")
public class ExamResultController implements IExamResultController {

    private final IExamResultService examResultService;

    public ExamResultController(IExamResultService examResultService) {
        this.examResultService = examResultService;
    }


    @GetMapping("/")
    @Override
    public GenericResponse<List<ExamResultDto>> getAllExamResults() {
        return GenericResponse.<List<ExamResultDto>>builder()
                .status(HttpStatus.OK)
                .message("success")
                .data(examResultService.getAllExamResult())
                .build();
    }

    @PostMapping("/")
    @Override
    public GenericResponse<ExamResultDto> saveExamResult(@RequestBody ExamResultDto ExamResult) {
        return GenericResponse.<ExamResultDto>builder()
                .status(HttpStatus.OK)
                .message("success")
                .data(examResultService.saveExamResult(ExamResult))
                .build();
    }


    @PutMapping("/{ExamResultId}")
    @Override
    public GenericResponse<ExamResultDto> updateExamResult(@RequestBody ExamResultDto ExamResultDto, @PathVariable UUID ExamResultId) {
        return GenericResponse.<ExamResultDto>builder()
                .status(HttpStatus.OK)
                .message("success")
                .data(examResultService.updateExamResult(ExamResultDto,ExamResultId))
                .build();
    }

    @DeleteMapping("/{ExamResultId}")
    @Override
    public GenericResponse<ExamResultDto> deleteExamResult(@PathVariable UUID ExamResultId) {
        return GenericResponse.<ExamResultDto>builder()
                .status(HttpStatus.OK)
                .message("success")
                .data(examResultService.deleteExamResult(ExamResultId))
                .build();
    }

    @GetMapping("/byStudent/{studentUid}")
    @Override
    public GenericResponse<List<ExamResultDto>> listExamResultBuStudent(@PathVariable UUID studentUid) {
        return GenericResponse.<List<ExamResultDto>>builder()
                .status(HttpStatus.OK)
                .message("success")
                .data(examResultService.listExamResultBuStudent(studentUid))
                .build();
    }
}
