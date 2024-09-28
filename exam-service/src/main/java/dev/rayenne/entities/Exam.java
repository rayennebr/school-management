package dev.rayenne.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name="exam")
public class Exam implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID examId;
    private UUID examTypeId;
    private String name;
    private Date startDate;

    @ManyToOne
    @JoinColumn(name = "examTypeId",referencedColumnName = "examTypeId",insertable = false,updatable = false)
    private ExamType examType;

    public Exam() {
    }

    public Exam(UUID examId, UUID examTypeId, String name, Date startDate, ExamType examType) {
        this.examId = examId;
        this.examTypeId = examTypeId;
        this.name = name;
        this.startDate = startDate;
        this.examType = examType;
    }

    public UUID getExamId() {
        return examId;
    }

    public void setExamId(UUID examId) {
        this.examId = examId;
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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public ExamType getExamType() {
        return examType;
    }

    public void setExamType(ExamType examType) {
        this.examType = examType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Exam exam = (Exam) o;
        return Objects.equals(examId, exam.examId) && Objects.equals(examTypeId, exam.examTypeId) && Objects.equals(name, exam.name) && Objects.equals(startDate, exam.startDate) && Objects.equals(examType, exam.examType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(examId, examTypeId, name, startDate, examType);
    }

    @Override
    public String toString() {
        return "Exam{" +
                "examId=" + examId +
                ", examTypeId=" + examTypeId +
                ", name='" + name + '\'' +
                ", startDate=" + startDate +
                ", examType=" + examType +
                '}';
    }
}
