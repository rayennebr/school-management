package dev.rayenne.entities;

import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Objects;

@Document(collation = "grade")
public class Grade implements Serializable {

    private String gradeId;
    private String name;
    private String des;

    public Grade() {
    }

    public Grade(String gradeId, String name, String des) {
        this.gradeId = gradeId;
        this.name = name;
        this.des = des;
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
        Grade grade = (Grade) o;
        return Objects.equals(gradeId, grade.gradeId) &&
                Objects.equals(name, grade.name) &&
                Objects.equals(des, grade.des);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gradeId, name, des);
    }

    @Override
    public String toString() {
        return "Grade{" +
                "gradeId='" + gradeId + '\'' +
                ", name='" + name + '\'' +
                ", des='" + des + '\'' +
                '}';
    }
}
