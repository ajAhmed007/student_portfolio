package com.example.demo.editProfile.academics;
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
                        88763L,
                        "Yahya",
                        "Ibrahim",
                        "yahya.ibrahim@uw.edu",
                        LocalDate.of(2001,Month.JULY, 1),
                        21,
                        "University of Washington",
                        LocalDate.of(2021, Month.SEPTEMBER, 28),
                        LocalDate.of(2025, Month.JUNE, 20),
                        List.of("Deans List Fall 2021")
                )
        );
    }


    public void addAcademics(Academics academics) {
        System.out.println(academics);
    }
}
