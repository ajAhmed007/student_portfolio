package com.example.demo.editProfile.student;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

/***
 * This is the service layer for the student.
 * it is responsible for all the business logic
 * about the student.
 * @author Ahmed Abdullahi
 * @version 7/2/22
 */

@Service //tells the controller that this object can be instantiated
public class StudentService {
    @GetMapping
    public static List<Student> getStudents(){
        return List.of(new Student(
                "Senior",
                "Washington",
                "Seattle",
                "University of Washington Bothell",
                LocalDate.of(2020, Month.SEPTEMBER, 20),
                LocalDate.of(2024, Month.JUNE, 20),
                4.0,
                1234L,
                "John Doe",
                "john.doe@gmail.com",
                LocalDate.of(2000, Month.JUNE, 30),
                22)
        );
    }


    public void addNewStudent(Student student) {
        student.getAge();
        student.getDob();
        student.getEmail();

        System.out.println(student);

    }
}
