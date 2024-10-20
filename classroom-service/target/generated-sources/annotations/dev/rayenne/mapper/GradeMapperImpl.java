package dev.rayenne.mapper;

import dev.rayenne.dto.GradeDto;
import dev.rayenne.entities.Grade;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-20T13:54:28+0200",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.11 (Oracle Corporation)"
)
@Component
public class GradeMapperImpl implements GradeMapper {

    @Override
    public GradeDto toDto(Grade grade) {
        if ( grade == null ) {
            return null;
        }

        GradeDto.GradeDtoBuilder gradeDto = GradeDto.builder();

        gradeDto.gradeId( grade.getGradeId() );
        gradeDto.name( grade.getName() );
        gradeDto.des( grade.getDes() );

        return gradeDto.build();
    }

    @Override
    public Grade toEntity(GradeDto gradeDto) {
        if ( gradeDto == null ) {
            return null;
        }

        Grade grade = new Grade();

        grade.setGradeId( gradeDto.gradeId() );
        grade.setName( gradeDto.name() );
        grade.setDes( gradeDto.des() );

        return grade;
    }

    @Override
    public void updateMapper(GradeDto gradeDto, Grade grade) {
        if ( gradeDto == null ) {
            return;
        }

        if ( gradeDto.gradeId() != null ) {
            grade.setGradeId( gradeDto.gradeId() );
        }
        if ( gradeDto.name() != null ) {
            grade.setName( gradeDto.name() );
        }
        if ( gradeDto.des() != null ) {
            grade.setDes( gradeDto.des() );
        }
    }
}
