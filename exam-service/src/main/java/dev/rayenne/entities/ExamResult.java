package dev.rayenne.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "examresult")
public class ExamResult implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID examResultId;
    private UUID studentId;
    private UUID courseId;

    private UUID examId;
    private Long marks;

    @ManyToOne
    @JoinColumn(name = "examId",referencedColumnName = "examId",insertable = false,updatable = false)
    private Exam exam;

    public ExamResult() {
    }

    public ExamResult(UUID examResultId,
                      UUID studentId,
                      UUID courseId,
                      Long marks,
                      UUID examId) {
        this.examResultId = examResultId;
        this.studentId = studentId;
        this.courseId = courseId;
        this.marks = marks;
        this.examId=examId;
    }

    public UUID getExamResultId() {
        return examResultId;
    }

    public void setExamResultId(UUID examResultId) {
        this.examResultId = examResultId;
    }

    public UUID getStudentId() {
        return studentId;
    }

    public void setStudentId(UUID studentId) {
        this.studentId = studentId;
    }

    public UUID getCourseId() {
        return courseId;
    }

    public void setCourseId(UUID courseId) {
        this.courseId = courseId;
    }

    public Long getMarks() {
        return marks;
    }

    public void setMarks(Long marks) {
        this.marks = marks;
    }

    public UUID getExamId() {
        return examId;
    }

    public void setExamId(UUID examId) {
        this.examId = examId;
    }

    public Exam getExam() {
        return exam;
    }

    public void setExam(Exam exam) {
        this.exam = exam;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExamResult that = (ExamResult) o;
        return Objects.equals(examResultId, that.examResultId) && Objects.equals(studentId, that.studentId) && Objects.equals(courseId, that.courseId) && Objects.equals(marks, that.marks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(examResultId, studentId, courseId, marks);
    }

    @Override
    public String toString() {
        return "ExamResult{" +
                "examResultId=" + examResultId +
                ", studentId=" + studentId +
                ", courseId=" + courseId +
                ", examId=" + examId +
                ", marks=" + marks +
                ", exam=" + exam +
                '}';
    }
}
