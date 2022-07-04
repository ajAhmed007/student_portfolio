package com.example.demo.editStudentProfile.academics;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class AcademicService{

    @GetMapping
    public static List<Academics> getAcademics(){
        return List.of(
                new Academics(
                "Senior",
                "Washington",
                "Seattle",
                "University of Washington",
                LocalDate.of(2020, Month.SEPTEMBER, 20),
                LocalDate.of(2022, Month.JUNE, 20),
                4.0)
        );
    }
}
