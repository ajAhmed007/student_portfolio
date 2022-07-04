package com.example.demo.editStudentProfile.suppLearning;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class SuppLearningService {
    @GetMapping
    static List<SuppLearning> getSuppLearning(){
        return List.of(new SuppLearning(
                "Senior",
                "Washington",
                "Seattle",
                LocalDate.of(2020,  Month.SEPTEMBER, 30),
                LocalDate.of(2022,  Month.JUNE, 30),
                4.0,
                "Bootcamp",
                "CodePath",
                "certificate of completion"

        ));
    }
}
