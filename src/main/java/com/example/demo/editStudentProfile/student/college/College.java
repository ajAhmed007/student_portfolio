package com.example.demo.editStudentProfile.student.college;

import com.example.demo.editStudentProfile.student.Student;

import java.time.LocalDate;

public class College extends Student {
    private String major;
    private String minor;

    public College(String gradeLevel,
                   String state,
                   String city,
                   String schoolName,
                   LocalDate startDate,
                   LocalDate endDate,
                   double gpa,
                   Long id,
                   String name,
                   String email,
                   LocalDate dob,
                   Integer age,
                   String major,
                   String minor) {
        super(gradeLevel, state, city, schoolName,
                startDate, endDate, gpa, id, name,
                email, dob, age);
        this.major = major;
        this.minor = minor;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getMinor() {
        return minor;
    }

    public void setMinor(String minor) {
        this.minor = minor;
    }
}
