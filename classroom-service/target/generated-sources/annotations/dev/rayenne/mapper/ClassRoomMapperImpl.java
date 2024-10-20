package dev.rayenne.mapper;

import dev.rayenne.dto.ClassRoomDto;
import dev.rayenne.entities.ClassRoom;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-20T13:54:29+0200",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.11 (Oracle Corporation)"
)
@Component
public class ClassRoomMapperImpl implements ClassRoomMapper {

    @Override
    public ClassRoomDto toDto(ClassRoom classRoom) {
        if ( classRoom == null ) {
            return null;
        }

        ClassRoomDto.ClassRoomDtoBuilder classRoomDto = ClassRoomDto.builder();

        classRoomDto.classRoomId( classRoom.getClassRoomId() );
        classRoomDto.teacherId( classRoom.getTeacherId() );
        classRoomDto.gradeId( classRoom.getGradeId() );
        classRoomDto.section( classRoom.getSection() );
        classRoomDto.status( classRoom.getStatus() );
        classRoomDto.remarks( classRoom.getRemarks() );

        return classRoomDto.build();
    }

    @Override
    public ClassRoom toEntity(ClassRoomDto classRoomDto) {
        if ( classRoomDto == null ) {
            return null;
        }

        ClassRoom classRoom = new ClassRoom();

        classRoom.setClassRoomId( classRoomDto.classRoomId() );
        classRoom.setTeacherId( classRoomDto.teacherId() );
        classRoom.setGradeId( classRoomDto.gradeId() );
        classRoom.setSection( classRoomDto.section() );
        classRoom.setStatus( classRoomDto.status() );
        classRoom.setRemarks( classRoomDto.remarks() );

        return classRoom;
    }

    @Override
    public void updateClassRoomMapper(ClassRoomDto classRoomDto, ClassRoom classRoom) {
        if ( classRoomDto == null ) {
            return;
        }

        if ( classRoomDto.classRoomId() != null ) {
            classRoom.setClassRoomId( classRoomDto.classRoomId() );
        }
        if ( classRoomDto.teacherId() != null ) {
            classRoom.setTeacherId( classRoomDto.teacherId() );
        }
        if ( classRoomDto.gradeId() != null ) {
            classRoom.setGradeId( classRoomDto.gradeId() );
        }
        if ( classRoomDto.section() != null ) {
            classRoom.setSection( classRoomDto.section() );
        }
        classRoom.setStatus( classRoomDto.status() );
        if ( classRoomDto.remarks() != null ) {
            classRoom.setRemarks( classRoomDto.remarks() );
        }
    }
}
