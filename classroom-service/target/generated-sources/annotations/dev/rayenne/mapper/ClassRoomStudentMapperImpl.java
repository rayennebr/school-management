package dev.rayenne.mapper;

import dev.rayenne.dto.ClassRoomStudentDto;
import dev.rayenne.entities.ClassRoomStudent;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-20T12:54:27+0200",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.11 (Oracle Corporation)"
)
@Component
public class ClassRoomStudentMapperImpl implements ClassRoomStudentMapper {

    @Override
    public ClassRoomStudentDto toDto(ClassRoomStudent classRoomStudent) {
        if ( classRoomStudent == null ) {
            return null;
        }

        ClassRoomStudentDto.ClassRoomStudentDtoBuilder classRoomStudentDto = ClassRoomStudentDto.builder();

        classRoomStudentDto.classroomStudentId( classRoomStudent.getClassroomStudentId() );
        classRoomStudentDto.classroomId( classRoomStudent.getClassroomId() );
        classRoomStudentDto.studentId( classRoomStudent.getStudentId() );

        return classRoomStudentDto.build();
    }

    @Override
    public ClassRoomStudent toEntity(ClassRoomStudentDto classRoomStudentDto) {
        if ( classRoomStudentDto == null ) {
            return null;
        }

        ClassRoomStudent classRoomStudent = new ClassRoomStudent();

        classRoomStudent.setClassroomStudentId( classRoomStudentDto.classroomStudentId() );
        classRoomStudent.setClassroomId( classRoomStudentDto.classroomId() );
        classRoomStudent.setStudentId( classRoomStudentDto.studentId() );

        return classRoomStudent;
    }

    @Override
    public void updateMapper(ClassRoomStudentDto classRoomStudentDto, ClassRoomStudent classRoomStudent) {
        if ( classRoomStudentDto == null ) {
            return;
        }

        if ( classRoomStudentDto.classroomStudentId() != null ) {
            classRoomStudent.setClassroomStudentId( classRoomStudentDto.classroomStudentId() );
        }
        if ( classRoomStudentDto.classroomId() != null ) {
            classRoomStudent.setClassroomId( classRoomStudentDto.classroomId() );
        }
        if ( classRoomStudentDto.studentId() != null ) {
            classRoomStudent.setStudentId( classRoomStudentDto.studentId() );
        }
    }
}
