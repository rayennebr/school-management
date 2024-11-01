package dev.rayenne.mapper;

import dev.rayenne.dto.ExamResultDto;
import dev.rayenne.entities.ExamResult;
import java.util.UUID;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-26T14:17:09+0200",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.11 (Oracle Corporation)"
)
@Component
public class ExamResultMapperImpl implements ExamResultMapper {

    @Override
    public ExamResult toEntity(ExamResultDto ExamResultDto) {
        if ( ExamResultDto == null ) {
            return null;
        }

        ExamResult examResult = new ExamResult();

        examResult.setExamResultId( ExamResultDto.examResultId() );
        examResult.setStudentId( ExamResultDto.studentId() );
        examResult.setCourseId( ExamResultDto.courseId() );
        examResult.setMarks( ExamResultDto.marks() );
        examResult.setExamId( ExamResultDto.examId() );

        return examResult;
    }

    @Override
    public ExamResultDto toDto(ExamResult ExamResult) {
        if ( ExamResult == null ) {
            return null;
        }

        UUID examResultId = null;
        UUID studentId = null;
        UUID courseId = null;
        UUID examId = null;
        Long marks = null;

        examResultId = ExamResult.getExamResultId();
        studentId = ExamResult.getStudentId();
        courseId = ExamResult.getCourseId();
        examId = ExamResult.getExamId();
        marks = ExamResult.getMarks();

        ExamResultDto examResultDto = new ExamResultDto( examResultId, studentId, courseId, examId, marks );

        return examResultDto;
    }

    @Override
    public void updateMapper(ExamResultDto ExamResultDto, ExamResult ExamResult) {
        if ( ExamResultDto == null ) {
            return;
        }

        if ( ExamResultDto.examResultId() != null ) {
            ExamResult.setExamResultId( ExamResultDto.examResultId() );
        }
        if ( ExamResultDto.studentId() != null ) {
            ExamResult.setStudentId( ExamResultDto.studentId() );
        }
        if ( ExamResultDto.courseId() != null ) {
            ExamResult.setCourseId( ExamResultDto.courseId() );
        }
        if ( ExamResultDto.marks() != null ) {
            ExamResult.setMarks( ExamResultDto.marks() );
        }
        if ( ExamResultDto.examId() != null ) {
            ExamResult.setExamId( ExamResultDto.examId() );
        }
    }
}
