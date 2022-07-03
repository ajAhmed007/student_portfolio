package com.example.demo.editStudentProfile.suppLearning;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class SuppLearningService {
    @GetMapping
    static List<SuppLearning> getSuppLearning(){
        return List.of(new SuppLearning(
                "freshman",
                "Washington",
                "Seattle",
                "09/01/2016",
                "06/20/2020",
                4.0,
                "Bootcamp",
                "CodePath",
                "certificate of completion"

        ), (new SuppLearning("senior",
                "Washington",
                "Tukwila",
                "09/06/2017",
                "06/18/2021",
                3.5,
                "Engineering Camp",
                "STEM for All",
                "certificate of completion")));
    }
}
