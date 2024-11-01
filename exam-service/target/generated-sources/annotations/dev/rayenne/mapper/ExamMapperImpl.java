package dev.rayenne.mapper;

import dev.rayenne.dto.ExamDto;
import dev.rayenne.entities.Exam;
import java.sql.Date;
import java.util.UUID;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-26T14:17:10+0200",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.11 (Oracle Corporation)"
)
@Component
public class ExamMapperImpl implements ExamMapper {

    @Override
    public Exam toEntity(ExamDto examDto) {
        if ( examDto == null ) {
            return null;
        }

        Exam exam = new Exam();

        exam.setExamId( examDto.examId() );
        exam.setExamTypeId( examDto.examTypeId() );
        exam.setName( examDto.name() );
        exam.setStartDate( examDto.startDate() );

        return exam;
    }

    @Override
    public ExamDto toDto(Exam exam) {
        if ( exam == null ) {
            return null;
        }

        UUID examId = null;
        UUID examTypeId = null;
        String name = null;
        Date startDate = null;

        examId = exam.getExamId();
        examTypeId = exam.getExamTypeId();
        name = exam.getName();
        startDate = exam.getStartDate();

        ExamDto examDto = new ExamDto( examId, examTypeId, name, startDate );

        return examDto;
    }

    @Override
    public void updateMapper(ExamDto examDto, Exam exam) {
        if ( examDto == null ) {
            return;
        }

        if ( examDto.examId() != null ) {
            exam.setExamId( examDto.examId() );
        }
        if ( examDto.examTypeId() != null ) {
            exam.setExamTypeId( examDto.examTypeId() );
        }
        if ( examDto.name() != null ) {
            exam.setName( examDto.name() );
        }
        if ( examDto.startDate() != null ) {
            exam.setStartDate( examDto.startDate() );
        }
    }
}
