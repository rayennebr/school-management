package dev.rayenne.services;

import dev.rayenne.dto.CourseDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ICourseService {

    List<CourseDto> getAllCourses();
    CourseDto saveCourse(CourseDto courseDto);
    CourseDto updateCourse(CourseDto courseDto , String courseId);
    CourseDto deleteCourse(String courseId);
}
