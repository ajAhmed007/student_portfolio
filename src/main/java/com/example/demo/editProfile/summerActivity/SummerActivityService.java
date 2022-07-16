package com.example.demo.editProfile.summerActivity;

import com.example.demo.editProfile.suppLearning.SuppLearning;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class SummerActivityService {
    @GetMapping
    public static List<SummerActivity> getSummerActivity() {
        return List.of(new SummerActivity(
                1234L,
                "Ahmed",
                "Abdullahi",
                "ahmed.abdullahi@gmail.com",
                LocalDate.of(2000, Month.JULY, 1),
                22,
                "Boot Camp",
                "CodePath",
                "Java Coding Boot Camp"
        ));
    }
}
