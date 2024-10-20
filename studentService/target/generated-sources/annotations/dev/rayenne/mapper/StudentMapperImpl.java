package dev.rayenne.mapper;

import dev.rayenne.dto.StudentDto;
import dev.rayenne.entitiy.Student;
import java.util.Date;
import java.util.UUID;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-20T13:03:29+0200",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.11 (Oracle Corporation)"
)
@Component
public class StudentMapperImpl implements StudentMapper {

    @Override
    public StudentDto toDto(Student student) {
        if ( student == null ) {
            return null;
        }

        UUID studentId = null;
        String fname = null;
        String lname = null;
        String email = null;
        Date dob = null;
        String phone = null;
        Date dateOfJoin = null;
        String status = null;
        Date lastLoginDate = null;
        Date createdAt = null;
        Date modifiedAt = null;
        UUID parentId = null;

        studentId = student.getStudentId();
        fname = student.getFname();
        lname = student.getLname();
        email = student.getEmail();
        dob = student.getDob();
        phone = student.getPhone();
        dateOfJoin = student.getDateOfJoin();
        status = student.getStatus();
        lastLoginDate = student.getLastLoginDate();
        createdAt = student.getCreatedAt();
        modifiedAt = student.getModifiedAt();
        parentId = student.getParentId();

        StudentDto studentDto = new StudentDto( studentId, fname, lname, email, dob, phone, dateOfJoin, status, lastLoginDate, createdAt, modifiedAt, parentId );

        return studentDto;
    }

    @Override
    public Student toEntity(StudentDto studentDto) {
        if ( studentDto == null ) {
            return null;
        }

        Student student = new Student();

        student.setStudentId( studentDto.studentId() );
        student.setFname( studentDto.fname() );
        student.setLname( studentDto.lname() );
        student.setEmail( studentDto.email() );
        student.setDob( studentDto.dob() );
        student.setPhone( studentDto.phone() );
        student.setDateOfJoin( studentDto.dateOfJoin() );
        student.setStatus( studentDto.status() );
        student.setLastLoginDate( studentDto.lastLoginDate() );
        student.setCreatedAt( studentDto.createdAt() );
        student.setModifiedAt( studentDto.modifiedAt() );
        student.setParentId( studentDto.parentId() );

        return student;
    }

    @Override
    public void updateMapper(StudentDto studentDto, Student student) {
        if ( studentDto == null ) {
            return;
        }

        if ( studentDto.studentId() != null ) {
            student.setStudentId( studentDto.studentId() );
        }
        if ( studentDto.fname() != null ) {
            student.setFname( studentDto.fname() );
        }
        if ( studentDto.lname() != null ) {
            student.setLname( studentDto.lname() );
        }
        if ( studentDto.email() != null ) {
            student.setEmail( studentDto.email() );
        }
        if ( studentDto.dob() != null ) {
            student.setDob( studentDto.dob() );
        }
        if ( studentDto.phone() != null ) {
            student.setPhone( studentDto.phone() );
        }
        if ( studentDto.dateOfJoin() != null ) {
            student.setDateOfJoin( studentDto.dateOfJoin() );
        }
        if ( studentDto.status() != null ) {
            student.setStatus( studentDto.status() );
        }
        if ( studentDto.lastLoginDate() != null ) {
            student.setLastLoginDate( studentDto.lastLoginDate() );
        }
        if ( studentDto.createdAt() != null ) {
            student.setCreatedAt( studentDto.createdAt() );
        }
        if ( studentDto.modifiedAt() != null ) {
            student.setModifiedAt( studentDto.modifiedAt() );
        }
        if ( studentDto.parentId() != null ) {
            student.setParentId( studentDto.parentId() );
        }
    }
}
