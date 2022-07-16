package com.example.demo.editProfile.volunteering;

import com.example.demo.editProfile.suppLearning.SuppLearning;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;


@Service
public class VolunteeringService {

    @GetMapping
    public static List<Volunteering> getAllVolunteering(){
        return List.of(new Volunteering(
                1234L,
                "Ahmed",
                "Abdullahi",
                "ahmed.abdullahi@gmail.com",
                LocalDate.of(2000, Month.JULY, 1),
                22,
                "Summer School",
                "Roosevelt High School",
                80
        ));
    }

}
