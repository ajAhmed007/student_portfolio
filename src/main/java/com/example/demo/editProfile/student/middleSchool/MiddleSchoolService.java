package com.example.demo.editProfile.student.middleSchool;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@Service
public class MiddleSchoolService {

    public static List<MiddleSchool> getMiddleSchoolStudents(){
        return List.of(new MiddleSchool(
                "Freshmen",
                "Washington",
                "Seattle",
                "Washignton Middle Schools",
                LocalDate.of(2022, Month.SEPTEMBER, 30),
                LocalDate.of(2026, Month.JUNE, 20),
                3.5,
                4561223L,
                "Farah Mohamed",
                "farah.mohamed@gmail.com",
                LocalDate.of(2007, Month.SEPTEMBER, 21),
                15,
                "Physics",
                "Science Club"
        ));
    }
}
