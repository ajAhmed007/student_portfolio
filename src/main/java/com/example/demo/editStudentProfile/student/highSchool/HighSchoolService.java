package com.example.demo.editStudentProfile.student.highSchool;

import org.springframework.stereotype.Service;

import javax.websocket.server.ServerEndpoint;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class HighSchoolService {

    public static  List<HighSchool> getHighSchoolStudents(){
        return List.of(new HighSchool(
                "Freshmen",
                "Washington",
                "Seattle",
                "Adams High Schools",
                LocalDate.of(2022, Month.SEPTEMBER, 30),
                LocalDate.of(2026, Month.JUNE, 20),
                3.5,
                4561223L,
                "Marriam Mohamed",
                "marriam.mohamed@gmail.com",
                LocalDate.of(2007, Month.SEPTEMBER, 21),
                15,
                "Chemistry",
                "Science Club"
        ));
    }
}
