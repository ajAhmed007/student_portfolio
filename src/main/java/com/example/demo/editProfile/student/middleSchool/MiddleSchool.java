package com.example.demo.editProfile.student.middleSchool;

import com.example.demo.editProfile.student.Student;

import java.time.LocalDate;

public class MiddleSchool extends Student {
    private String honorCourse;
    private String clubs;

    public MiddleSchool(String gradeLevel,
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
                      String honorCourse,
                      String clubs) {
        super(gradeLevel, state, city, schoolName, startDate, endDate,
                gpa, id, name, email, dob, age);
        this.honorCourse = honorCourse;
        this.clubs = clubs;
    }

    public String getHonorCourse() {
        return honorCourse;
    }

    public void setHonorCourse(String honorCourse) {
        this.honorCourse = honorCourse;
    }

    public String getClubs() {
        return clubs;
    }

    public void setClubs(String clubs) {
        this.clubs = clubs;
    }

    @Override
    public String toString() {
        return "HighSchool{" +
                "honorCourse='" + honorCourse + '\'' +
                ", clubs='" + clubs + '\'' +
                '}';
    }
}
