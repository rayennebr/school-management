package dev.rayenne.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "teacher")
public class Teacher implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID teacherId;
    private String fname;
    private String lname;
    private String email;
    private Date dob;
    private char sex;
    private String phone;
    private String address;
    private Date doj;
}
