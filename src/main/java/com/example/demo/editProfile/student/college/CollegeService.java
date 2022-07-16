package com.example.demo.editProfile.student.college;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class CollegeService {
    @GetMapping
    public static List<College> getCollegeStudent(){
        return List.of(new College(
                1634L,
                "John",
                "Jones",
                "john.jones@gmail.com",
                LocalDate.of(2000, Month.JULY, 1),
                22,
                "Computer Science",
                "Applied Computing"
        ));
    }

}
