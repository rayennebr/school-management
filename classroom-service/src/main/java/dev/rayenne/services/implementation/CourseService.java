package dev.rayenne.services.implementation;

import dev.rayenne.dto.CourseDto;
import dev.rayenne.mapper.CourseMapper;
import dev.rayenne.repositories.CourseRepository;
import dev.rayenne.services.ICourseService;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.NoSuchElementException;

@Component
public class CourseService implements ICourseService {

    private final CourseRepository courseRepository;
    private final CourseMapper courseMapper;

    public CourseService(CourseRepository courseRepository, CourseMapper courseMapper) {
        this.courseRepository = courseRepository;
        this.courseMapper = courseMapper;
    }

    @Override
    public List<CourseDto> getAllCourses() {
        return courseRepository.findAll()
                .stream()
                .map(courseMapper::toDto)
                .toList();
    }

    @Override
    public CourseDto saveCourse(CourseDto courseDto) {
        return courseMapper.toDto(courseRepository.insert(
                courseMapper.toEntity(
                        courseDto
                )
        ));
    }

    @Override
    public CourseDto updateCourse(CourseDto courseDto, String courseId) {
        var courseToUpdate=courseRepository.findById(courseId)
                .orElseThrow(()->new NoSuchElementException("course n'existe pas "));
        courseMapper.updateMapper(courseDto,courseToUpdate);
        return courseMapper.toDto(courseToUpdate);
    }

    @Override
    public CourseDto deleteCourse(String courseId) {
        var courseToDelete=courseRepository.findById(courseId)
                .orElseThrow(()->new NoSuchElementException("course n'existe pas "));
        courseRepository.delete(courseToDelete);
        return courseMapper.toDto(courseToDelete);
    }
}
