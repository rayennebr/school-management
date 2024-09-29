package dev.rayenne.mapper;

import dev.rayenne.dto.ExamTypeDto;
import dev.rayenne.entities.ExamType;
import java.util.UUID;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-09-29T14:26:50+0200",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.11 (Oracle Corporation)"
)
@Component
public class ExamTypeMapperImpl implements ExamTypeMapper {

    @Override
    public ExamType toEntity(ExamTypeDto ExamTypeDto) {
        if ( ExamTypeDto == null ) {
            return null;
        }

        ExamType examType = new ExamType();

        examType.setExamTypeId( ExamTypeDto.examTypeId() );
        examType.setName( ExamTypeDto.name() );
        examType.setdes( ExamTypeDto.des() );

        return examType;
    }

    @Override
    public ExamTypeDto toDto(ExamType ExamType) {
        if ( ExamType == null ) {
            return null;
        }

        UUID examTypeId = null;
        String name = null;
        String des = null;

        examTypeId = ExamType.getExamTypeId();
        name = ExamType.getName();
        des = ExamType.getdes();

        ExamTypeDto examTypeDto = new ExamTypeDto( examTypeId, name, des );

        return examTypeDto;
    }

    @Override
    public void updateMapper(ExamTypeDto ExamTypeDto, ExamType ExamType) {
        if ( ExamTypeDto == null ) {
            return;
        }

        if ( ExamTypeDto.examTypeId() != null ) {
            ExamType.setExamTypeId( ExamTypeDto.examTypeId() );
        }
        if ( ExamTypeDto.name() != null ) {
            ExamType.setName( ExamTypeDto.name() );
        }
        if ( ExamTypeDto.des() != null ) {
            ExamType.setdes( ExamTypeDto.des() );
        }
    }
}
