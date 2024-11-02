package dev.rayenne.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Objects;

@Document(collection = "course")
public class Course implements Serializable {

    @Id
    private String courseId;
    private String gradeId;
    private String name;
    private String des;


    public Course() {
    }

    public Course(String courseId, String gradeId, String name, String des) {
        this.courseId = courseId;
        this.gradeId = gradeId;
        this.name = name;
        this.des = des;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getGradeId() {
        return gradeId;
    }

    public void setGradeId(String gradeId) {
        this.gradeId = gradeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(courseId, course.courseId) &&
                Objects.equals(gradeId, course.gradeId) &&
                Objects.equals(name, course.name) &&
                Objects.equals(des, course.des);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseId, gradeId, name, des);
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId='" + courseId + '\'' +
                ", gradeId='" + gradeId + '\'' +
                ", name='" + name + '\'' +
                ", des='" + des + '\'' +
                '}';
    }
}
