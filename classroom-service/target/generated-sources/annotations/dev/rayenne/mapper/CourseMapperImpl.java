package dev.rayenne.mapper;

import dev.rayenne.dto.CourseDto;
import dev.rayenne.entities.Course;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-26T13:30:50+0200",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.11 (Oracle Corporation)"
)
@Component
public class CourseMapperImpl implements CourseMapper {

    @Override
    public CourseDto toDto(Course course) {
        if ( course == null ) {
            return null;
        }

        CourseDto.CourseDtoBuilder courseDto = CourseDto.builder();

        courseDto.courseId( course.getCourseId() );
        courseDto.gradeId( course.getGradeId() );
        courseDto.name( course.getName() );
        courseDto.des( course.getDes() );

        return courseDto.build();
    }

    @Override
    public Course toEntity(CourseDto courseDto) {
        if ( courseDto == null ) {
            return null;
        }

        Course course = new Course();

        course.setCourseId( courseDto.courseId() );
        course.setGradeId( courseDto.gradeId() );
        course.setName( courseDto.name() );
        course.setDes( courseDto.des() );

        return course;
    }

    @Override
    public void updateMapper(CourseDto courseDto, Course course) {
        if ( courseDto == null ) {
            return;
        }

        if ( courseDto.courseId() != null ) {
            course.setCourseId( courseDto.courseId() );
        }
        if ( courseDto.gradeId() != null ) {
            course.setGradeId( courseDto.gradeId() );
        }
        if ( courseDto.name() != null ) {
            course.setName( courseDto.name() );
        }
        if ( courseDto.des() != null ) {
            course.setDes( courseDto.des() );
        }
    }
}
