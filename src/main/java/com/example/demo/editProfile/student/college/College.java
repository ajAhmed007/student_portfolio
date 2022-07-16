package com.example.demo.editProfile.student.college;

import com.example.demo.editProfile.student.Student;

import java.time.LocalDate;

public class College extends Student {
    private String major;
    private String minor;

    public College() {
    }

    public College(Long id,
                   String firstName,
                   String lastName,
                   String email,
                   LocalDate dob,
                   Integer age,
                   String major,
                   String minor) {
        super(id, firstName, lastName, email, dob, age);
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

    @Override
    public String toString() {
        return "College{" +
                "major='" + major + '\'' +
                ", minor='" + minor + '\'' +
                '}';
    }
}

