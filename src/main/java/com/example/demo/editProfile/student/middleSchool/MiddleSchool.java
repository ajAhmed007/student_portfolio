package com.example.demo.editProfile.student.middleSchool;

import com.example.demo.editProfile.student.Student;

import java.time.LocalDate;
import java.util.List;

public class MiddleSchool extends Student {
    private List<String> honorCourse;
    private List<String> clubs;

    public MiddleSchool(Long id,
                        String firstName,
                        String lastName,
                        String email,
                        LocalDate dob,
                        Integer age,
                        List<String> honorCourse,
                        List<String> clubs) {
        super(id, firstName, lastName, email, dob, age);
        this.honorCourse = honorCourse;
        this.clubs = clubs;
    }
    public MiddleSchool(Long id,
                        String firstName,
                        String lastName,
                        String email,
                        LocalDate dob,
                        Integer age) {
        super(id, firstName, lastName, email, dob, age);
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

    @Override
    public String toString() {
        return "HighSchool{" +
                "honorCourse='" + honorCourse + '\'' +
                ", clubs='" + clubs + '\'' +
                '}';
    }
}
