package com.example.demo.editProfile.student.highSchool;

import com.example.demo.editProfile.student.Student;

import java.time.LocalDate;
import java.util.List;

public class HighSchool extends Student {
    private List<String> honorCourse;
    private List<String> clubs;

    private List<String> projects;

    public HighSchool(Long id,
                      String firstName,
                      String lastName,
                      String email,
                      LocalDate dob,
                      Integer age,
                      List<String> honorCourse,
                      List<String> clubs,
                      List<String> projects) {
        super(id, firstName, lastName, email, dob, age);
        this.honorCourse = honorCourse;
        this.clubs = clubs;
        this.projects = projects;
    }

    public HighSchool(Long id,
                      String firstName,
                      String lastName,
                      String email,
                      LocalDate dob,
                      Integer age) {
        super(id, firstName, lastName, email, dob, age);
    }

    public HighSchool(List<String> honorCourse,
                      List<String> clubs,
                      List<String> projects) {
        this.honorCourse = honorCourse;
        this.clubs = clubs;
        this.projects = projects;
    }

    /***
     * Default Constructor
     */
    public HighSchool() {
    }

    public List<String> getHonorCourse() {
        return honorCourse;
    }

    public void setHonorCourse(List<String> honorCourse) {
        this.honorCourse = honorCourse;
    }

    public List<String> getClubs() {
        return clubs;
    }

    public void setClubs(List<String> clubs) {
        this.clubs = clubs;
    }
}
