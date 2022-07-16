package com.example.demo.editProfile.student.highSchool;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class HighSchoolService {

    public static  List<HighSchool> getHighSchoolStudents(){
        return List.of(new HighSchool(
                12345L,
                "William",
                "Michael",
                "william.michael@gmail.com",
                LocalDate.of(2002, Month.JUNE, 1),
                20
        ));
    }



    public static List<HighSchool> getHonors_Clubs(){
        return List.of(new HighSchool(
                12345L,
                "jama",
                "Ahmed",
                "jama.ahmed@gmail.com",
                LocalDate.of(2005, Month.JUNE, 1),
                17,
                List.of("Honors Physics", "Honors Calculus"),
                List.of("Engineering Club"),
                List.of("working on Discord Clone")
        ));
    }

}
