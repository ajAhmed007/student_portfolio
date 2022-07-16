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
                1234L,
                "Ron",
                "William",
                "ron.william@gmail.com",
                LocalDate.of(2002, Month.JUNE, 1),
                20,
                "Washington High School",
                "Boys Basketball",
                "Panthers",
                "Basketball"
                )
        );
    }
}
