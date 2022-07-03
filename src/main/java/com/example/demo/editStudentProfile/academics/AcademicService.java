package com.example.demo.editStudentProfile.academics;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Service
public class AcademicService{

    @GetMapping
    public static List<Academics> getAcademics(){
        return List.of(new Academics(
                "junior",
                "Washington",
                "Seattle",
                "Ballad High School",
                "09/01/2016",
                "06/20/2020",
                4.0
        ));
    }
}
