package dev.rayenne.mapper;

import dev.rayenne.dto.TeacherDto;
import dev.rayenne.entities.Teacher;
import java.util.Date;
import java.util.UUID;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-20T13:04:05+0200",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.11 (Oracle Corporation)"
)
@Component
public class TeacherMapperImpl implements TeacherMapper {

    @Override
    public TeacherDto toDto(Teacher teacher) {
        if ( teacher == null ) {
            return null;
        }

        UUID teacherId = null;
        String fname = null;
        String lname = null;
        String email = null;
        Date dob = null;
        char sex = 0;
        String phone = null;
        String address = null;
        Date doj = null;

        TeacherDto teacherDto = new TeacherDto( teacherId, fname, lname, email, dob, sex, phone, address, doj );

        return teacherDto;
    }

    @Override
    public Teacher toEntity(TeacherDto teacherDto) {
        if ( teacherDto == null ) {
            return null;
        }

        Teacher teacher = new Teacher();

        return teacher;
    }

    @Override
    public void updateMap(TeacherDto teacherDto, Teacher teacher) {
        if ( teacherDto == null ) {
            return;
        }
    }
}
