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
                "senior",
                "Washington",
                "Bellevue",
                "Bellevue College",
                LocalDate.of(2018, Month.SEPTEMBER, 20),
                LocalDate.of(2022, Month.JUNE, 27),
                3.8,
                215564L,
                "William Gass",
                "william.gass@gmail.com",
                LocalDate.of(1998, Month.JUNE, 20),
                24,
                "Computer Science",
                "Applied Computing"
        ));
    }

}
