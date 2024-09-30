package dev.rayenne.entities;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

@Document(collation = "classroomstudent")
public class ClassRoomStudent implements Serializable {

    @Id
    private String classroomStudentId;
    private String classroomId;
    private UUID studentId;

    public ClassRoomStudent() {
    }

    public ClassRoomStudent(String classroomStudentId, String classroomId, UUID studentId) {
        this.classroomStudentId = classroomStudentId;
        this.classroomId = classroomId;
        this.studentId = studentId;
    }

    public String getClassroomStudentId() {
        return classroomStudentId;
    }

    public void setClassroomStudentId(String classroomStudentId) {
        this.classroomStudentId = classroomStudentId;
    }

    public String getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(String classroomId) {
        this.classroomId = classroomId;
    }

    public UUID getStudentId() {
        return studentId;
    }

    public void setStudentId(UUID studentId) {
        this.studentId = studentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassRoomStudent that = (ClassRoomStudent) o;
        return Objects.equals(classroomStudentId, that.classroomStudentId) &&
                Objects.equals(classroomId, that.classroomId) &&
                Objects.equals(studentId, that.studentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(classroomStudentId, classroomId, studentId);
    }

    @Override
    public String toString() {
        return "ClassRoomStudent{" +
                "classroomStudentId='" + classroomStudentId + '\'' +
                ", classroomId='" + classroomId + '\'' +
                ", studentId=" + studentId +
                '}';
    }
}
