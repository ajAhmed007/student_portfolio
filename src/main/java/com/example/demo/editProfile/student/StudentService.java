package com.example.demo.editProfile.student;

import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.nio.charset.StandardCharsets;
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
                1234L,
                "Ahmed",
                "Abdullahi",
                "ahmed.abdullahi@gmail.com",
                LocalDate.of(2000, Month.JULY, 1),
                22
                )
        );
    }

    public void addNewStudent(Student student) {}
}
