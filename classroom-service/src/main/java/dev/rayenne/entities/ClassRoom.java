package dev.rayenne.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;
import java.util.UUID;

@Document(collation = "classroom")
public class ClassRoom {

    @Id
    private String classRoomId;
    private UUID teacherId;
    private String gradeId;
    private String section;
    private int status;
    private String remarks;

    public ClassRoom() {
    }

    public ClassRoom(String classRoomId, UUID teacherId,
                     String gradeId, String section,
                     int status, String remarks)
    {
        this.classRoomId = classRoomId;
        this.teacherId = teacherId;
        this.gradeId = gradeId;
        this.section = section;
        this.status = status;
        this.remarks = remarks;
    }

    public String getClassRoomId() {
        return classRoomId;
    }

    public void setClassRoomId(String classRoomId) {
        this.classRoomId = classRoomId;
    }

    public UUID getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(UUID teacherId) {
        this.teacherId = teacherId;
    }

    public String getGradeId() {
        return gradeId;
    }

    public void setGradeId(String gradeId) {
        this.gradeId = gradeId;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassRoom classRoom = (ClassRoom) o;
        return status == classRoom.status && Objects.equals(classRoomId, classRoom.classRoomId) && Objects.equals(teacherId, classRoom.teacherId) && Objects.equals(gradeId, classRoom.gradeId) && Objects.equals(section, classRoom.section) && Objects.equals(remarks, classRoom.remarks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(classRoomId, teacherId, gradeId, section, status, remarks);
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "classRoomId='" + classRoomId + '\'' +
                ", teacherId=" + teacherId +
                ", gradeId='" + gradeId + '\'' +
                ", section='" + section + '\'' +
                ", status=" + status +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
