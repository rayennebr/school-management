package dev.rayenne.services;

import dev.rayenne.dto.GradeDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IGradeService {

    List<GradeDto>getAllGrades();
    GradeDto saveGrade(GradeDto gradeDto);
    GradeDto updateGrade(GradeDto gradeDto,String gradeId);
    GradeDto deleteGrade(String gradeId);
}
