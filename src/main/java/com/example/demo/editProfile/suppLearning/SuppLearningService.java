package com.example.demo.editProfile.suppLearning;

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
                1234L,
                "Ahmed",
                "Abdullahi",
                "ahmed.abdullahi@gmail.com",
                LocalDate.of(2000, Month.JULY, 1),
                22,
                "Summer School",
                "Roosevelt High School",
                "Certificate of Completion"
        ));
    }
}
