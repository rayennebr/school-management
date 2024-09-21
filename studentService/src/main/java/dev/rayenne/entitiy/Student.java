package dev.rayenne.entitiy;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "student")
@EntityListeners(AuditingEntityListener.class)
public class Student implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID studentId;
    private String fname;
    private String lname;
    private String email;
    private Date dob;
    private String phone;
    private Date dateOfJoin;
    private String status;
    private Date lastLoginDate;
    @CreatedDate
    private Date createdAt;
    @LastModifiedDate
    private Date modifiedAt;
    private UUID parentId;

    public Student() {
    }

    public Student(UUID studentId, String fname,
                   String lname, String email,
                   Date dob, String phone,
                   Date dateOfJoin, String status,
                   Date lastLoginDate, Date createdAt,
                   Date modifiedAt, UUID parentId) {
        this.studentId = studentId;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.dob = dob;
        this.phone = phone;
        this.dateOfJoin = dateOfJoin;
        this.status = status;
        this.lastLoginDate = lastLoginDate;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
        this.parentId = parentId;
    }

    public UUID getStudentId() {
        return studentId;
    }

    public void setStudentId(UUID studentId) {
        this.studentId = studentId;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getDateOfJoin() {
        return dateOfJoin;
    }

    public void setDateOfJoin(Date dateOfJoin) {
        this.dateOfJoin = dateOfJoin;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(Date modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public UUID getParentId() {
        return parentId;
    }

    public void setParentId(UUID parentId) {
        this.parentId = parentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(studentId, student.studentId) &&
                Objects.equals(fname, student.fname) &&
                Objects.equals(lname, student.lname) &&
                Objects.equals(email, student.email) &&
                Objects.equals(dob, student.dob) &&
                Objects.equals(phone, student.phone) &&
                Objects.equals(dateOfJoin, student.dateOfJoin) &&
                Objects.equals(status, student.status) &&
                Objects.equals(lastLoginDate, student.lastLoginDate) &&
                Objects.equals(createdAt, student.createdAt) &&
                Objects.equals(modifiedAt, student.modifiedAt) &&
                Objects.equals(parentId, student.parentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, fname, lname,
                email, dob, phone,
                dateOfJoin, status, lastLoginDate,
                createdAt, modifiedAt, parentId);
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                ", phone='" + phone + '\'' +
                ", dateOfJoin=" + dateOfJoin +
                ", status='" + status + '\'' +
                ", lastLoginDate=" + lastLoginDate +
                ", createdAt=" + createdAt +
                ", modifiedAt=" + modifiedAt +
                ", parentId=" + parentId +
                '}';
    }
}
