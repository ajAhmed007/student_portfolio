package com.example.demo.editProfile.volunteering;

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
                "Senior",
                "Washington",
                "Seattle",
                LocalDate.of(2021, Month.JUNE, 25),
                LocalDate.of(2022, Month.SEPTEMBER, 20),
                "Seattle Public Library",
                400,
                "Volunteered at the library organizing books"
        ));
    }

}
