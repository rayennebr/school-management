package dev.rayenne.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name="examtype")
public class ExamType implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID examTypeId;
    private String name;
    private String des;

    public ExamType() {
    }

    public ExamType(UUID examTypeId, String name, String des) {
        this.examTypeId = examTypeId;
        this.name = name;
        this.des = des;
    }

    public UUID getExamTypeId() {
        return examTypeId;
    }

    public void setExamTypeId(UUID examTypeId) {
        this.examTypeId = examTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getdes() {
        return des;
    }

    public void setdes(String des) {
        this.des = des;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExamType examType = (ExamType) o;
        return Objects.equals(examTypeId, examType.examTypeId) && Objects.equals(name, examType.name) && Objects.equals(des, examType.des);
    }

    @Override
    public int hashCode() {
        return Objects.hash(examTypeId, name, des);
    }

    @Override
    public String toString() {
        return "ExamType{" +
                "examtypeId=" + examTypeId +
                ", name='" + name + '\'' +
                ", des='" + des + '\'' +
                '}';
    }
}
