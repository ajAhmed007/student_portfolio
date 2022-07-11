package com.example.demo.editProfile.sports;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@Service
public class SportService {
    public static List<Sports> getSports(){
        List<String> sports = new ArrayList<>();
        return List.of(new Sports(
                "Junior",
                "Washington",
                "Seattle",
                LocalDate.of(2020, Month.SEPTEMBER, 17),
                LocalDate.of(2023, Month.JUNE, 20),
                3.5,
                "Roosevelt High School",
                "Varsity Basketball",
                "Warriors",
                "Basketball"
                ),
                new Sports(
                        "Senior",
                        "Washington",
                        "Seattle",
                        LocalDate.of(2020, Month.SEPTEMBER, 17),
                        LocalDate.of(2023, Month.JUNE, 20),
                        3.5,
                        "Ballard High School",
                        "Varsity Soccer",
                        "Beavers",
                        "Soccer"
                )
        );
    }
}
